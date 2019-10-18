@groovy.transform.Canonical
class Tweet {
    String msg, username
    Date postDateTime
    
    private List favorites = []
    private List retweets = []
//    private List mentions = []
//    private List hashtags = []   
   
   void favorite(String username){
       favorites << username
   }
   
   List getFavorites(){
       favorites
   }
  
   void retweets(String username){
       retweets << username
   }
   
   List getRetweets(){
       retweets
   } 
   
   List getMentions(){
      String pattern = /\B@[a-z0-9_-]+/
      msg.findAll(pattern)
   }
   
   List getHashTags(){
      String pattern = ~/(?:\s|\A)[##]+([A-Za-z0-9-_]+)/
      msg.findAll(pattern)
   }
   
}

Tweet t = new Tweet(msg: 'My tweet @tt #Groovy #java', username:'ayc', postDateTime:new Date())
println t
t.favorite('@Apache')
t.retweets('@ApacheGroovy')
println "favorites: ${t.getFavorites()}, retweets:${t.getRetweets()}"

println t.getMentions()
println t.getHashTags()
