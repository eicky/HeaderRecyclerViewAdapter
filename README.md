# HeaderRecyclerViewAdapter     [![](https://jitpack.io/v/eicky/HeaderRecyclerViewAdapter.svg)](https://jitpack.io/#eicky/HeaderRecyclerViewAdapter)

为RecyclerView添加头部视图
## Use
```get
    allprojects {
    		repositories {
    			...
    			maven { url "https://jitpack.io" }
    		}
    	}

```
```get
    dependencies {
    	        compile 'com.github.eicky:HeaderRecyclerViewAdapter:1.0'
    	}

```

##Code
* 创建一个RecyclerView的适配器，实现里面的方法
```code
public class MyAdapter extends HeaderRecyclerViewAdapter<HeaderViewHolder, ItemViewHolder> {
    public MyAdapter(RecyclerView.LayoutManager layoutManager) {
        super(layoutManager);
    }

    @Override
    protected int getHeaderCount() {
        //Header个数
        return 0;
    }

    @Override
    protected int getItemCountForSection(int section) {
        //对应Header的Item个数
        return 0;
    }

    @Override
    protected HeaderViewHolder onCreateHeaderViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    protected ItemViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    protected void onBindHeaderViewHolder(HeaderViewHolder holder, int headerPosition) {

    }

    @Override
    protected void onBindItemViewHolder(ItemViewHolder holder, int headerPosition, int itemPosition) {

    }
}
```

* 在List中使用
```code
LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
MyAdapter myAdapter = new MyAdapter(linearLayoutManager);
recyclerview.setAdapter(myAdapter);
```

* 在Grid中使用
```code
GridLayoutManager gridLayoutManager = new GridLayoutManager(Context, 2);
MyAdapter myAdapter = new MyAdapter(gridLayoutManager);
recyclerview.setAdapter(myAdapter);
```

##Demo
* List、Grid

<img src="https://github.com/eicky/HeaderRecyclerViewAdapter/blob/master/img/list.jpg" height="640" width="360" >
<img src="https://github.com/eicky/HeaderRecyclerViewAdapter/blob/master/img/grid.jpg" height="640" width="360" >

## 关于我

* Blog: [http://www.eicky.com](http://www.eicky.com)
* Mail: eicky@eicky.com

## License

    Copyright 2017 Eicky

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

