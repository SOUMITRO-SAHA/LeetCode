# Find the number of islands
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a grid of size n*m (n is the number of rows and m is the number of columns in the grid) consisting of '0's (Water)&nbsp;and '1's(Land). Find the number of islands.</span><br>
<br>
<strong><span style="font-size:18px">Note: </span></strong><span style="font-size:18px">An&nbsp;island&nbsp;is either surrounded by water or boundary of grid and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<div class="pieces-code-wrapper" style="text-align: left; margin-top: 10px;"><pre style="margin-bottom: 0px; margin-top: 0px;"><span style="font-size:18px"><strong>Input:
</strong>grid = {{0,1},{1,0},{1,1},{1,0}}
<strong>Output:
</strong>1
<strong>Explanation:
</strong>The grid is-
0 <span style="color: rgb(0, 0, 128); --darkreader-inline-color: #7fb3ff;" data-darkreader-inline-color="">1</span></span>
<span style="font-size:18px"><span style="color: rgb(0, 0, 128); --darkreader-inline-color: #7fb3ff;" data-darkreader-inline-color="">1</span> 0
<span style="color: rgb(0, 0, 128); --darkreader-inline-color: #7fb3ff;" data-darkreader-inline-color="">1</span> <span style="color: rgb(0, 0, 128); --darkreader-inline-color: #7fb3ff;" data-darkreader-inline-color="">1
1</span> 0
All lands are connected.</span>
</pre><div class="pieces-btn-wrapper" style="border: none; display: flex; opacity: 0; width: auto; transition: opacity 0.3s ease-out 0s; height: 26px; margin-top: 10px; margin-bottom: 10px; --darkreader-inline-border-top: initial; --darkreader-inline-border-right: initial; --darkreader-inline-border-bottom: initial; --darkreader-inline-border-left: initial;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left=""><button class="pieces-btn pieces-copy-and-save" style="width: auto; font-size: 12px; border: 1px solid rgb(33, 33, 33); border-radius: 16px; margin-right: 4px; padding: 4px 6px 4px 4px; line-height: normal; height: fit-content; cursor: pointer; user-select: none; display: flex; align-items: center; background-color: rgb(33, 33, 33); color: rgb(255, 255, 255); --darkreader-inline-border-top: #817768; --darkreader-inline-border-right: #817768; --darkreader-inline-border-bottom: #817768; --darkreader-inline-border-left: #817768; --darkreader-inline-bgcolor: #0f1112; --darkreader-inline-color: #f2f0ed; opacity: 1;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left="" data-darkreader-inline-bgcolor="" data-darkreader-inline-color=""><img src="https://storage.googleapis.com/pieces-web-extensions-cdn/pieces.png" class="pieces-logo" style="margin: 0px 4px 0px 0px; border-radius: 50%; filter: none; float: left; width: 16px; height: 16px;"><span class="pieces-btn-text">Copy and Save</span></button><button class="pieces-btn pieces-share" style="width: auto; font-size: 12px; border: 1px solid rgb(33, 33, 33); border-radius: 16px; margin-right: 4px; padding: 4px 6px 4px 4px; line-height: normal; height: fit-content; cursor: pointer; user-select: none; display: flex; align-items: center; background-color: rgb(33, 33, 33); color: rgb(255, 255, 255); --darkreader-inline-border-top: #817768; --darkreader-inline-border-right: #817768; --darkreader-inline-border-bottom: #817768; --darkreader-inline-border-left: #817768; --darkreader-inline-bgcolor: #0f1112; --darkreader-inline-color: #f2f0ed; opacity: 1;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left="" data-darkreader-inline-bgcolor="" data-darkreader-inline-color=""><img src="https://storage.googleapis.com/pieces-web-extensions-cdn/link.png" class="pieces-logo" style="margin: 0px 4px 0px 0px; border-radius: 50%; filter: none; float: left; width: 16px; height: 16px;"><span class="pieces-btn-text">Share</span></button></div></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<div class="pieces-code-wrapper" style="text-align: left; margin-top: 10px;"><pre style="margin-bottom: 0px; margin-top: 0px;"><span style="font-size:18px"><strong>Input:
</strong>grid = {{0,1,1,1,0,0,0},{0,0,1,1,0,1,0}}
<strong>Output:
</strong>2
<strong>Expanation:
</strong>The grid is-
0 <span style="color: rgb(0, 0, 128); --darkreader-inline-color: #7fb3ff;" data-darkreader-inline-color="">1 1 1</span> 0 0 0
0 0 <span style="color: rgb(0, 0, 128); --darkreader-inline-color: #7fb3ff;" data-darkreader-inline-color="">1 1</span> 0 <span style="color: rgb(255, 0, 0); --darkreader-inline-color: #ff1010;" data-darkreader-inline-color="">1</span> 0&nbsp;
There are two islands :- one is colored in blue 
and other in orange.</span>
</pre><div class="pieces-btn-wrapper" style="border: none; display: flex; opacity: 0; width: auto; transition: opacity 0.3s ease-out 0s; height: 26px; margin-top: 10px; margin-bottom: 10px; --darkreader-inline-border-top: initial; --darkreader-inline-border-right: initial; --darkreader-inline-border-bottom: initial; --darkreader-inline-border-left: initial;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left=""><button class="pieces-btn pieces-copy-and-save" style="width: auto; font-size: 12px; border: 1px solid rgb(33, 33, 33); border-radius: 16px; margin-right: 4px; padding: 4px 6px 4px 4px; line-height: normal; height: fit-content; cursor: pointer; user-select: none; display: flex; align-items: center; background-color: rgb(33, 33, 33); color: rgb(255, 255, 255); --darkreader-inline-border-top: #817768; --darkreader-inline-border-right: #817768; --darkreader-inline-border-bottom: #817768; --darkreader-inline-border-left: #817768; --darkreader-inline-bgcolor: #0f1112; --darkreader-inline-color: #f2f0ed;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left="" data-darkreader-inline-bgcolor="" data-darkreader-inline-color=""><img src="https://storage.googleapis.com/pieces-web-extensions-cdn/pieces.png" class="pieces-logo" style="margin: 0px 4px 0px 0px; border-radius: 50%; filter: none; float: left; width: 16px; height: 16px;"><span class="pieces-btn-text">Copy and Save</span></button><button class="pieces-btn pieces-share" style="width: auto; font-size: 12px; border: 1px solid rgb(33, 33, 33); border-radius: 16px; margin-right: 4px; padding: 4px 6px 4px 4px; line-height: normal; height: fit-content; cursor: pointer; user-select: none; display: flex; align-items: center; background-color: rgb(33, 33, 33); color: rgb(255, 255, 255); --darkreader-inline-border-top: #817768; --darkreader-inline-border-right: #817768; --darkreader-inline-border-bottom: #817768; --darkreader-inline-border-left: #817768; --darkreader-inline-bgcolor: #0f1112; --darkreader-inline-color: #f2f0ed;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left="" data-darkreader-inline-bgcolor="" data-darkreader-inline-color=""><img src="https://storage.googleapis.com/pieces-web-extensions-cdn/link.png" class="pieces-logo" style="margin: 0px 4px 0px 0px; border-radius: 50%; filter: none; float: left; width: 16px; height: 16px;"><span class="pieces-btn-text">Share</span></button></div></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function <strong>numIslands()&nbsp;</strong>which takes the grid as an input parameter and returns the total number of islands.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n*m)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(n*m)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n, m ≤ 500</span></p>
</div>