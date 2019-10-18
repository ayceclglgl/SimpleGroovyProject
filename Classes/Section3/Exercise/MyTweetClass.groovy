class Tweet{
    String username
    String text
    Integer retweets
    Integer favorites
    Date created
   
    
    public Tweet(String username, String text){
        username = username
        text = text 
        retweets = 0
        favorites = favorites
        created = new Date()
    }
    
    void addToRetweets(){
        retweets +=1
    }
    
    void addToFavorites(){
        favorites +=1
    }
    
    String toString(){
        "username=$username text=$text retweets=$retweets favorites=$favorites created=$created"
    }
}

Tweet t = new Tweet("ayce", "Fist tweet")
println t
