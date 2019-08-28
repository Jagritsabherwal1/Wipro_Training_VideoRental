package VideoRental;

class Video{
	String title;
	int checked=0,rating=5,n=1,returned=1; //checked=1 means video is sold
	public void setTitle(String t){
		title=t;
	}
	public String getTitle(){
		return title;
	}
	public void setChecked(){
		checked=1;
	}
	public int getChecked(){
		return checked;
	}
	public int getRating(){ //rating should be between 0-10
		return rating;
	}
	public void returnVideo(){
		checked=0;
	}
	public void setRating(int r){
		rating=(rating*n+r)/(n+1);
		n+=1;
	}}
