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


/*
We got an error: 

1 compilation error:
Invalid duplicate class definition of class Tweet : The source Tweet.groovy contains at least two definitions of the class Tweet.
One of the classes is an explicit generated class using the class statement, the other is a class generated from the script body based on the file name. Solutions are to change the file name or to change the class name.
 at line: 1, column: 1
 
What's happening here is groovvy has two ways to treat a groovvy file.
It's either a script or it's a class definition.
* Anything outside a class definition is a script.

if it's a script you cannot have a class the same name in that file. We have a script and in the same file we have a class called Tweet.
Groovey will actually create a containing class with the same name in the file called Tweet. - Groovvy wraps our script in a class called Tweet.
So we have 2 classes called Tweet.

If we want to write a script we can change the file name so class name and the filename, i.e. className = Tweet fileName = MyTweetClass, will be different from each other.
And our script is wraped in a class called MyTweetClass

*/