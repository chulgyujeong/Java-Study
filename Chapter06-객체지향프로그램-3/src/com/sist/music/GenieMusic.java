package com.sist.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 * 
 * 
*/
public class GenieMusic extends Music {
// MovieVO[] => 초기화 static / 생성자
	public GenieMusic()
	{
		// 초기화 => MusicVO
		try
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		    Elements title=doc.select("table.list-wrap a.title");
		    Elements singer=doc.select("table.list-wrap a.artist");
		    Elements album=doc.select("table.list-wrap a.albumtitle");
		    Elements poster=doc.select("table.list-wrap a.cover img");
		    Elements rank=doc.select("table.list-wrap td.number");
		    Elements etc=doc.select("table.list-wrap span.rank");
		    
		    for(int i=0;i<title.size();i++)
		    {
		     System.out.println(title.get(i).text());
		     System.out.println(singer.get(i).text());
		     System.out.println(poster.get(i).attr("src"));
		     System.out.println(album.get(i).text());
		     System.out.println(rank.get(i).text());
		     String temp=etc.get(i).text();
			 System.out.println(temp.replaceAll("[^0-9]",""));
		     System.out.println(temp.replaceAll("[^가-힣]",""));
		     System.out.println("=======================================");
             musics[i]=new MusicVO();
             musics[i].setTitle(title.get(i).text());
             musics[i].setSinger(singer.get(i).text());
             musics[i].setPoster(poster.get(i).attr("src"));
             musics[i].setAlbum(album.get(i).text());
             musics[i].setRank(i+1);
             String state="";
             int id=0;
             if(temp.equals("유지"))
             {
            	 id=0;
            	 state="유지";
             }
             else
             {
            	 id=Integer.parseInt(temp.replaceAll("[^0-9]",""));
            	 state=temp.replaceAll("[^가-힣]","");
             }
             musics[i].setState(state);
             musics[i].setIdcrement(id);
		    }
		}
		catch(Exception ex)
		{
		  	ex.printStackTrace();
		}
	}
	}
