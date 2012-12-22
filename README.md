CSULB-CECS-451-Assignment3
==========================

This is the solution I came up with the for CSULB CECS 451 (Introduction to Artificial Intelligence) assignment #3. For the dataset given, this program was able to predict the correct results with ~85% accuracy (70% was required for an A). The assignment was created by Darin Goldstein (http://www.cecs.csulb.edu/~daring/). I'm certain that many optimizations could be made to increase the performance of this code, but at the time it was written, given the time constraints of a full courseload and a part-time job, it wasn't practical. This program solves the problem in less than 1 second, which is totally sufficient. Feel free to optimize it as you wish!



The problem:
If we have to have a choice between being dead and pitied, and being alive with a bad image, we'd rather be alive and have the bad image. -Golda Meir In this assignment, you will attempt to classify objects in a non academic situation.

Assume that you are the leader of a country. Your country shares a border with another country that is decidedly unfriendly to yours. On a regular basis, rockets are fired from the unfriendly country into yours. These rockets are not perfectly accurate but they routinely cause damage to buildings, interrupt everyday life, and occasionally injure or kill citizens of your country. In short, they need to be dealt with. Unfortunately, there are numerous distinct hostile elements in the other country and your response as leader of your own country will depend on which is firing the rockets. Of course, there is a great deal of uncertainty as to which 3 group fired which rocket. Luckily, your intelligence services are hard at work and are able to classify a good portion of the rockets. Your job is, given a list of attributes and classification results, determine which rockets were fired by which group. You will receive as input a text file called  data.txt. This text file can be opened with any spreadsheet program (e.g. Excel, OpenOfice, etc.). There will be 16,000 records in this data file. The first 15,000 of these records will be classified into one of four hostile groups (namely, 0, 1, 2, or 3) or "unknown" (4). Your job is to classify the final 1,000 rockets
and rewrite the data file with these fields filled in. You may assume the following:

1. Your country has 3 cities that are located at the following coordinates: (10,10), (14,14), (18,10). Notice that these coordinates form a triangle. One of the possible attributes that may be important is which city the rocket targeted. Unfortunately, the only information that you have at your disposal are the coordinates where the rocket landed. The first two fields will be the x and y coordinates respectively of the landing spot of the rocket.

2. The third field will be the political climate at the time of the launch. This is a binary field where a 0 indicates that the climate was relatively calm and a 1 indicates volatility of some kind.

3. The fourth field will be the type of rocket. There are 4 types of rockets, 0 being the most expensive and therefore most accurate and 3 being the least.

4. The fifth field will indicate any modifications made to the rocket. 0 will indicate that no modifications were made. 1 will indicate that ball bearings or other metal objects were packed onto the outside of the rocket (so that the rocket acts like a grenade). 2 indicates that extra explosives were used.

5. The final field indicates which hostile group fired the rocket. The final thousand records will not have this sixth and final field. It is your goal to fill these in so as to maximize the percentage of correctly classified rockets.

You will turn in this assignment by emailing me the  data.txt file with the
fields filled in. You should be able to hit at least roughly 70% accuracy. (Second
and third tries can be made with the same data file.)


