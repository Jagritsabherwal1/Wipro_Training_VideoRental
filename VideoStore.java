package VideoRental;

class VideoStore{
	Video videos[] = new Video[10];
	int totalVideos=-1;	
	int indexOfVideo=-1;	
	public void addVideo(String s){
		if(totalVideos+1!=10)totalVideos+=1;
		videos[totalVideos]=new Video();
		videos[totalVideos].setTitle(s);
		System.out.println("New Movie added:"+s);
	}
	private int findIndex(String s){
		indexOfVideo=-1;
		for(int i=0;i<=totalVideos;i++){
			if(videos[i].getTitle().equals(s)){
				indexOfVideo=i;			
			}}
		return indexOfVideo;
	}
	public void doCheckout(String s){
		int ind=findIndex(s);
		if(ind==-1){
			System.out.println("We don't sell "+s);
		}else{
			if(videos[ind].getChecked()==1)System.out.println("Movie not available currently");
			else {
				videos[ind].setChecked();
				System.out.println("You Just Bought the Movie: "+videos[ind].getTitle());
			}}}
	public void doReturn(String s){
		int ind=findIndex(s);
		if(ind==-1){
			System.out.println("No such movie existed.");
		}else{
			if(videos[ind].getChecked()==0)System.out.println("Sorry but we didn't sold "+s+" to you, You bought it from some other shop");
			else{
				videos[ind].returnVideo();
				System.out.println("You just successfully returned "+s);
			}}}
	public void receiveRating(String s,int i){
		int ind=findIndex(s);
		if(ind==-1){
			System.out.println("No such movie existed.");
		}else{
			videos[ind].setRating(i);
			System.out.println("New rating for "+s+" is:"+videos[ind].getRating());
		}
	}
	public void listInventory(){
		System.out.println("List of movies we have:");
		for(int i=0;i<=totalVideos;i++){
			if(videos[i].getChecked()==0)
			System.out.println("We have: "+videos[i].getTitle());
		}}}
