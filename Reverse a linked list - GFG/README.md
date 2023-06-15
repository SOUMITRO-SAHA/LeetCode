# Reverse a linked list
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a linked list of <strong>N </strong>nodes. The task is to reverse this list.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<div class="pieces-code-wrapper" style="text-align: left; margin-top: 10px;"><pre style="margin-bottom: 0px; margin-top: 0px;"><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">LinkedList: 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6
<strong>Output: </strong>6 5 4 3 2 1<strong>
Explanation: </strong>After reversing the list, 
elements are 6-&gt;5-&gt;4-&gt;3-&gt;2-&gt;1.</span>
</pre><div class="pieces-btn-wrapper" style="border: none; display: flex; opacity: 0; width: auto; transition: opacity 0.3s ease-out 0s; height: 26px; margin-top: 10px; margin-bottom: 10px; --darkreader-inline-border-top: initial; --darkreader-inline-border-right: initial; --darkreader-inline-border-bottom: initial; --darkreader-inline-border-left: initial;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left=""><button class="pieces-btn pieces-copy-and-save" style="width: auto; font-size: 12px; border: 1px solid rgb(33, 33, 33); border-radius: 16px; margin-right: 4px; padding: 4px 6px 4px 4px; line-height: normal; height: fit-content; cursor: pointer; user-select: none; display: flex; align-items: center; background-color: rgb(33, 33, 33); color: rgb(255, 255, 255); --darkreader-inline-border-top: #817664; --darkreader-inline-border-right: #817664; --darkreader-inline-border-bottom: #817664; --darkreader-inline-border-left: #817664; --darkreader-inline-bgcolor: #000000; --darkreader-inline-color: #ffffff;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left="" data-darkreader-inline-bgcolor="" data-darkreader-inline-color=""><img src="https://storage.googleapis.com/pieces-web-extensions-cdn/pieces.png" class="pieces-logo" style="margin: 0px 4px 0px 0px; border-radius: 50%; filter: none; float: left; width: 16px; height: 16px;"><span class="pieces-btn-text">Copy and Save</span></button><button class="pieces-btn pieces-share" style="width: auto; font-size: 12px; border: 1px solid rgb(33, 33, 33); border-radius: 16px; margin-right: 4px; padding: 4px 6px 4px 4px; line-height: normal; height: fit-content; cursor: pointer; user-select: none; display: flex; align-items: center; background-color: rgb(33, 33, 33); color: rgb(255, 255, 255); --darkreader-inline-border-top: #817664; --darkreader-inline-border-right: #817664; --darkreader-inline-border-bottom: #817664; --darkreader-inline-border-left: #817664; --darkreader-inline-bgcolor: #000000; --darkreader-inline-color: #ffffff;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left="" data-darkreader-inline-bgcolor="" data-darkreader-inline-color=""><img src="https://storage.googleapis.com/pieces-web-extensions-cdn/link.png" class="pieces-logo" style="margin: 0px 4px 0px 0px; border-radius: 50%; filter: none; float: left; width: 16px; height: 16px;"><span class="pieces-btn-text">Share</span></button></div></div>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<div class="pieces-code-wrapper" style="text-align: left; margin-top: 10px;"><pre style="margin-bottom: 0px; margin-top: 0px;"><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">LinkedList: 2-&gt;7-&gt;8-&gt;9-&gt;10
<strong>Output: </strong>10 9 8 7 2<strong>
Explanation: </strong>After reversing the list,
elements are&nbsp;10-&gt;9-&gt;8-&gt;7-&gt;2.</span></pre><div class="pieces-btn-wrapper" style="border: none; display: flex; opacity: 0; width: auto; transition: opacity 0.3s ease-out 0s; height: 26px; margin-top: 10px; margin-bottom: 10px; --darkreader-inline-border-top: initial; --darkreader-inline-border-right: initial; --darkreader-inline-border-bottom: initial; --darkreader-inline-border-left: initial;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left=""><button class="pieces-btn pieces-copy-and-save" style="width: auto; font-size: 12px; border: 1px solid rgb(33, 33, 33); border-radius: 16px; margin-right: 4px; padding: 4px 6px 4px 4px; line-height: normal; height: fit-content; cursor: pointer; user-select: none; display: flex; align-items: center; background-color: rgb(33, 33, 33); color: rgb(255, 255, 255); --darkreader-inline-border-top: #817664; --darkreader-inline-border-right: #817664; --darkreader-inline-border-bottom: #817664; --darkreader-inline-border-left: #817664; --darkreader-inline-bgcolor: #000000; --darkreader-inline-color: #ffffff;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left="" data-darkreader-inline-bgcolor="" data-darkreader-inline-color=""><img src="https://storage.googleapis.com/pieces-web-extensions-cdn/pieces.png" class="pieces-logo" style="margin: 0px 4px 0px 0px; border-radius: 50%; filter: none; float: left; width: 16px; height: 16px;"><span class="pieces-btn-text">Copy and Save</span></button><button class="pieces-btn pieces-share" style="width: auto; font-size: 12px; border: 1px solid rgb(33, 33, 33); border-radius: 16px; margin-right: 4px; padding: 4px 6px 4px 4px; line-height: normal; height: fit-content; cursor: pointer; user-select: none; display: flex; align-items: center; background-color: rgb(33, 33, 33); color: rgb(255, 255, 255); --darkreader-inline-border-top: #817664; --darkreader-inline-border-right: #817664; --darkreader-inline-border-bottom: #817664; --darkreader-inline-border-left: #817664; --darkreader-inline-bgcolor: #000000; --darkreader-inline-color: #ffffff;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left="" data-darkreader-inline-bgcolor="" data-darkreader-inline-color=""><img src="https://storage.googleapis.com/pieces-web-extensions-cdn/link.png" class="pieces-logo" style="margin: 0px 4px 0px 0px; border-radius: 50%; filter: none; float: left; width: 16px; height: 16px;"><span class="pieces-btn-text">Share</span></button></div></div>

<p><span style="font-size:18px"><strong>Your&nbsp;Task:</strong><br>
The task is to complete the function <strong>reverseList</strong>() with&nbsp;head reference as the only argument and should return new head after reversing the list.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>4</sup></span></p>

<p>&nbsp;</p>
</div>