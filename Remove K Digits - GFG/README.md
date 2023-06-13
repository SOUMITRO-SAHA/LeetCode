# Remove K Digits
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a non-negative integer S&nbsp;represented as a string, remove&nbsp;K&nbsp;digits from the number so that the new number is the smallest possible.<br>
<strong>Note :&nbsp;</strong>The given&nbsp;<em>num</em>&nbsp;does not contain any leading zero.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<div class="pieces-code-wrapper" style="text-align: left; margin-top: 10px;"><pre style="margin-bottom: 0px; margin-top: 0px;"><span style="font-size:18px"><strong>Input:</strong>
S = "149811", K = 3
<strong>Output:</strong> 111
<strong>Explanation</strong>: Remove the three digits 
4, 9, and 8 to form the new number 111
which is smallest.</span>
</pre><div class="pieces-btn-wrapper" style="border: none; display: flex; opacity: 0; width: auto; transition: opacity 0.3s ease-out 0s; height: 26px; margin-top: 10px; margin-bottom: 10px; --darkreader-inline-border-top: initial; --darkreader-inline-border-right: initial; --darkreader-inline-border-bottom: initial; --darkreader-inline-border-left: initial;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left=""><button class="pieces-btn pieces-copy-and-save" style="width: auto; font-size: 12px; border: 1px solid rgb(33, 33, 33); border-radius: 16px; margin-right: 4px; padding: 4px 6px 4px 4px; line-height: normal; height: fit-content; cursor: pointer; user-select: none; display: flex; align-items: center; background-color: rgb(33, 33, 33); color: rgb(255, 255, 255); --darkreader-inline-border-top: #817664; --darkreader-inline-border-right: #817664; --darkreader-inline-border-bottom: #817664; --darkreader-inline-border-left: #817664; --darkreader-inline-bgcolor: #000000; --darkreader-inline-color: #ffffff; opacity: 1;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left="" data-darkreader-inline-bgcolor="" data-darkreader-inline-color=""><img src="https://storage.googleapis.com/pieces-web-extensions-cdn/pieces.png" class="pieces-logo" style="margin: 0px 4px 0px 0px; border-radius: 50%; filter: none; float: left; width: 16px; height: 16px;"><span class="pieces-btn-text">Copy and Save</span></button><button class="pieces-btn pieces-share" style="width: auto; font-size: 12px; border: 1px solid rgb(33, 33, 33); border-radius: 16px; margin-right: 4px; padding: 4px 6px 4px 4px; line-height: normal; height: fit-content; cursor: pointer; user-select: none; display: flex; align-items: center; background-color: rgb(33, 33, 33); color: rgb(255, 255, 255); --darkreader-inline-border-top: #817664; --darkreader-inline-border-right: #817664; --darkreader-inline-border-bottom: #817664; --darkreader-inline-border-left: #817664; --darkreader-inline-bgcolor: #000000; --darkreader-inline-color: #ffffff;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left="" data-darkreader-inline-bgcolor="" data-darkreader-inline-color=""><img src="https://storage.googleapis.com/pieces-web-extensions-cdn/link.png" class="pieces-logo" style="margin: 0px 4px 0px 0px; border-radius: 50%; filter: none; float: left; width: 16px; height: 16px;"><span class="pieces-btn-text">Share</span></button></div></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<div class="pieces-code-wrapper" style="text-align: left; margin-top: 10px;"><pre style="margin-bottom: 0px; margin-top: 0px;"><span style="font-size:18px"><strong>Input</strong>:
S = "1002991", K = 3
<strong>Output:</strong> 21
<strong>Explanation</strong>: Remove the three digits 1(leading
one), 9, and 9 to form the new number 21(Note
that the output must not contain leading
zeroes) which is the smallest.</span></pre><div class="pieces-btn-wrapper" style="border: none; display: flex; opacity: 0; width: auto; transition: opacity 0.3s ease-out 0s; height: 26px; margin-top: 10px; margin-bottom: 10px; --darkreader-inline-border-top: initial; --darkreader-inline-border-right: initial; --darkreader-inline-border-bottom: initial; --darkreader-inline-border-left: initial;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left=""><button class="pieces-btn pieces-copy-and-save" style="width: auto; font-size: 12px; border: 1px solid rgb(33, 33, 33); border-radius: 16px; margin-right: 4px; padding: 4px 6px 4px 4px; line-height: normal; height: fit-content; cursor: pointer; user-select: none; display: flex; align-items: center; background-color: rgb(33, 33, 33); color: rgb(255, 255, 255); --darkreader-inline-border-top: #817664; --darkreader-inline-border-right: #817664; --darkreader-inline-border-bottom: #817664; --darkreader-inline-border-left: #817664; --darkreader-inline-bgcolor: #000000; --darkreader-inline-color: #ffffff;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left="" data-darkreader-inline-bgcolor="" data-darkreader-inline-color=""><img src="https://storage.googleapis.com/pieces-web-extensions-cdn/pieces.png" class="pieces-logo" style="margin: 0px 4px 0px 0px; border-radius: 50%; filter: none; float: left; width: 16px; height: 16px;"><span class="pieces-btn-text">Copy and Save</span></button><button class="pieces-btn pieces-share" style="width: auto; font-size: 12px; border: 1px solid rgb(33, 33, 33); border-radius: 16px; margin-right: 4px; padding: 4px 6px 4px 4px; line-height: normal; height: fit-content; cursor: pointer; user-select: none; display: flex; align-items: center; background-color: rgb(33, 33, 33); color: rgb(255, 255, 255); --darkreader-inline-border-top: #817664; --darkreader-inline-border-right: #817664; --darkreader-inline-border-bottom: #817664; --darkreader-inline-border-left: #817664; --darkreader-inline-bgcolor: #000000; --darkreader-inline-color: #ffffff;" data-darkreader-inline-border-top="" data-darkreader-inline-border-right="" data-darkreader-inline-border-bottom="" data-darkreader-inline-border-left="" data-darkreader-inline-bgcolor="" data-darkreader-inline-color=""><img src="https://storage.googleapis.com/pieces-web-extensions-cdn/link.png" class="pieces-logo" style="margin: 0px 4px 0px 0px; border-radius: 50%; filter: none; float: left; width: 16px; height: 16px;"><span class="pieces-btn-text">Share</span></button></div></div>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>removeKdigits()&nbsp;</strong>which takes the string S and an integer K as input and returns the new number which is the smallest possible.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(|S|).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(|S|).</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=|S|&lt;=10002</span><br>
<span style="font-size:18px">1&lt;=K&lt;=|S|</span></p>
</div>