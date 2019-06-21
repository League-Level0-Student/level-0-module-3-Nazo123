void setup(){
  size(500,500);
  

}
void draw(){
  
    for(int i=40;i>-0;i-=4){
  if(i%8==0){
    fill(255,0,0);
    ellipse(250,250,i*10,i*10);
  }
  else{
  fill(0,0,0);
  ellipse(250,250,i*10,i*10);
  }
}
  
  
  
}
