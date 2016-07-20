public class Twitter {
    HashMap<Integer, Set<Integer>> followMap;
    // Set<Integer> followSet = new HashSet<>();
    List<List<Integer>> allNews;
    /** Initialize your data structure here. */
    public Twitter() {
        followMap = new HashMap<Integer, Set<Integer>>();
        allNews = new ArrayList<List<Integer>>();
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        List<Integer> tmp = new ArrayList<>();
        tmp.add(userId);
        tmp.add(tweetId);
        allNews.add(tmp);
        return;
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        int count = 0;
        List<Integer> res = new ArrayList<>();
        for(int i = allNews.size() - 1; i >= 0 && count <= 10; i--) {
            int user = allNews.get(i).get(0);
            if(user == userId || followMap.get(userId).contains(user)) { // if this is the user or the user this follows
                res.add(allNews.get(i).get(1));
                count++;
            }
        }
        return res;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(followMap.containsKey(followerId)) {
            followMap.get(followerId).add(followeeId);
        } else {
            Set<Integer> tmpSet = new HashSet<>();
            tmpSet.add(followeeId);
            followMap.put(followerId, tmpSet);
        }
        return;
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(followMap.containsKey(followerId)) {
            followMap.get(followerId).remove(followeeId);
        }
        return;
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */