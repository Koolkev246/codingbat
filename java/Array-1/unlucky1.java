public boolean unlucky1(int[] nums) {
  if (nums.length<2)
  return false;
  else if (nums[0]==1 && nums[1]==3 || nums[nums.length-1]-nums[nums.length-2]==2)
  return true;
  else if (nums.length>2 && (nums[2]-nums[1]==2))
return true;
else
return false;
  
}
