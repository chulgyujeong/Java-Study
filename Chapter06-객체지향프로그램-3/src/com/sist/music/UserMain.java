package com.sist.music;
import java.util.*;

public class UserMain {
	
	public static void main(String[] args) {
     Music music=new MelonMusic();
     MusicVO[] list=music.musicListData();
     for(MusicVO vo:list)
     {
    	 System.out.println(vo.getRank()+"."+vo.getTitle());
     }
     
     Scanner scan=new Scanner(System.in);
     System.out.print("노래 제목 입력:");
     String title=scan.nextLine();
     
     list=music.musicSearchTitle(title);
     System.out.println("총 검색:"+list.length+"건");
     for(MusicVO vo:list)
     {
    	 if(vo == null)
    	 System.out.println(vo.getRank()+"."+vo.getTitle());	 
     }
    	
     
     System.out.print("가수명 입력:");
     String singer=scan.nextLine();
     
     list=music.musicSearchSinger(singer);
     System.out.println("총 검색:"+list.length+"건");
     for(MusicVO vo:list)
     {
    	 System.out.println(vo.getRank()+"."+vo.getTitle()+" "+vo.getSinger());	 
     }
    scan.close();	 
}
}