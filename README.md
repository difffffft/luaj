### luaj是lua的超集,luaj和lua的关系相当于ts和js的关系
### 核心语法魔改作者:@nirenr
### github:https://github.com/nirenr

### 可省略非必要关键字then
```lua
local a = true
if a print(123) end
```
### 可省略非必要关键字do
```lua
local a = true
while a print(123) end
```
### 可省略非必要关键字in
```lua
local t = {a=100,b=200}
for k,v pairs(t)
    print(k,v)
end
```
### 支持switch+case+default
```lua
local a = 1
switch a
  case 1,3,5,7,9
    print(1)
  case 2,4,6,8
    print(2)
  case 0
    print(0)
  default
    print(nil)
end
```
### 支持for
```lua
local t = {a=100,b=200}
for k,v : t
    print(k,v)
end
```
### 支持defer,先入后出原则运行
```lua
defer print("defer")
print("func")
```
### 支持try,catch,finally
```lua
try
    error("err")
catch(m)
    print("catch",m)
finally
    print("finally")
end
```
### 支持import导入java类
```lua
import "java.util.ArrayList"
print(ArrayList)

--支持用变量接收
local Arr = import "java.util.ArrayList"
print(ArrayList)

--支持用别名
import arr "java.util.ArrayList"
print(arr)
```
### 创建java对象或者实现java类
```lua
import "java.lang.Runnable"
import "java.util.ArrayList"

local arr = ArrayList()
local mRunnable=Runnable{
    run=function()

    end
}
print(mRunnable)
```
### 支持创建Java类型的数组
```lua
import "java.lang.String"
import "java.util.ArrayList"
local arr = int[10]
local brr = String[10]
local crr = ArrayList[10]
print(crr)
```
### 支持与或非
```lua
print(true && false)
print(true || false)
print(!false)
print(!true)
```
### 支持创建64位整数
```lua
i = 0xffffffffff
print(i)
```
### java的单行注释
```lua
//print(100)
```
### 支持python的lambda表达式
```lua
g = lambda x: x+1
print(g(1))
```