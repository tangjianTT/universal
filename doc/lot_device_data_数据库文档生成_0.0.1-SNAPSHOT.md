# fire数据库文档

**数据库名：** lot_device_data

**文档版本：** 0.0.1-SNAPSHOT

**文档描述：** 数据库文档生成
| 表名                  | 说明       |
| :-------------------- | :--------- |
| [log_data_share](#log_data_share) | 数据共享 |
| [lot_api](#lot_api) | API接口 |
| [lot_binding](#lot_binding) | 数据绑定 |
| [lot_data](#lot_data) | 设备数据 |
| [lot_database](#lot_database) | 数据库 |
| [lot_device_information](#lot_device_information) | 物联网设备信息 |
| [lot_log](#lot_log) | 日志 |
| [lot_system_resource](#lot_system_resource) |  |
| [lot_toolbox](#lot_toolbox) |  |
| [lot_user](#lot_user) | 用户 |
**表名：** <a id="log_data_share">log_data_share</a>

**说明：** 数据共享

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | username |   varchar   | 255 |   0    |    Y     |  N   |       | 提交人  |
|  3   | content |   varchar   | 255 |   0    |    Y     |  N   |       | 内容  |
|  4   | status |   varchar   | 255 |   0    |    Y     |  N   |   1    | 状态(1-待审批，2-审批成功，3-审批失败）  |
|  5   | result |   varchar   | 255 |   0    |    Y     |  N   |       | 结果  |
|  6   | create_time |   datetime   | 19 |   0    |    Y     |  N   |       | 提交时间  |
|  7   | result_time |   datetime   | 19 |   0    |    Y     |  N   |       | 反馈时间  |
|  8   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |
|  9   | is_del |   varchar   | 255 |   0    |    Y     |  N   |   0    | 删除标识  |
**表名：** <a id="lot_api">lot_api</a>

**说明：** API接口

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | committee_office |   varchar   | 255 |   0    |    Y     |  N   |       | 所属委办局  |
|  2   | api_name |   varchar   | 255 |   0    |    Y     |  N   |       | 接口名称  |
|  3   | api |   varchar   | 1000 |   0    |    Y     |  N   |       | 接口地址  |
**表名：** <a id="lot_binding">lot_binding</a>

**说明：** 数据绑定

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | id  |
|  2   | binding_name |   varchar   | 255 |   0    |    Y     |  N   |       | 设备编号  |
|  3   | user_name |   varchar   | 255 |   0    |    Y     |  N   |       | 账号名称  |
|  4   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    | 是否删除1删除  |
**表名：** <a id="lot_data">lot_data</a>

**说明：** 设备数据

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | committee_office |   varchar   | 255 |   0    |    Y     |  N   |       | 所属委办局  |
|  2   | quipment_number |   varchar   | 255 |   0    |    Y     |  N   |       | 设备编号  |
|  3   | data_content |   varchar   | 500 |   0    |    Y     |  N   |       | 数据内容  |
|  4   | threshold |   varchar   | 255 |   0    |    Y     |  N   |       | 阈值  |
|  5   | current_value |   varchar   | 255 |   0    |    Y     |  N   |       | 当前值  |
|  6   | type |   varchar   | 255 |   0    |    Y     |  N   |       | 设备种类  |
|  7   | update_time |   varchar   | 50 |   0    |    Y     |  N   |       | 时间  |
|  8   | state |   varchar   | 5 |   0    |    Y     |  N   |       | 状态  |
|  9   | real_time |   int   | 10 |   0    |    Y     |  N   |       | 是否实时，1是，0否  |
|  10   | receiving_frequency |   varchar   | 255 |   0    |    Y     |  N   |       | 接收频率  |
|  11   | destruction_frequency |   varchar   | 255 |   0    |    Y     |  N   |       | 销毁频率  |
|  12   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="lot_database">lot_database</a>

**说明：** 数据库

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | committee_office |   varchar   | 255 |   0    |    Y     |  N   |       | 所属委办局  |
|  2   | database_name |   varchar   | 255 |   0    |    Y     |  N   |       | 数据库名称  |
|  3   | url |   varchar   | 255 |   0    |    Y     |  N   |       | 数据库地址  |
|  4   | user_name |   varchar   | 255 |   0    |    Y     |  N   |       | 用户名  |
|  5   | pass_word |   varchar   | 255 |   0    |    Y     |  N   |       | 密码  |
|  6   | database |   varchar   | 255 |   0    |    Y     |  N   |       | 初始数据库  |
**表名：** <a id="lot_device_information">lot_device_information</a>

**说明：** 物联网设备信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | committee_office |   varchar   | 255 |   0    |    Y     |  N   |       | 所属委办局  |
|  2   | quipment_number |   varchar   | 255 |   0    |    Y     |  N   |       | 设备编号  |
|  3   | type |   varchar   | 255 |   0    |    Y     |  N   |       | 设备种类  |
|  4   | label |   varchar   | 255 |   0    |    Y     |  N   |       | 标签  |
|  5   | update_time |   varchar   | 50 |   0    |    Y     |  N   |       | 更新时间  |
|  6   | registration_time |   datetime   | 19 |   0    |    Y     |  N   |       | 注册时间  |
|  7   | onlinestatus |   int   | 10 |   0    |    Y     |  N   |       | 在线状态，1在线，0离线  |
|  8   | access_mode |   varchar   | 255 |   0    |    Y     |  N   |       | 接入方式  |
|  9   | update_frequency |   varchar   | 255 |   0    |    Y     |  N   |       | 更新频率  |
|  10   | actual_update_frequency |   varchar   | 255 |   0    |    Y     |  N   |       | 实际更新频率  |
**表名：** <a id="lot_log">lot_log</a>

**说明：** 日志

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | username |   varchar   | 255 |   0    |    Y     |  N   |       | 用户名  |
|  2   | ip |   varchar   | 255 |   0    |    Y     |  N   |       | 登录ip  |
|  3   | frequency |   int   | 10 |   0    |    Y     |  N   |       | 访问频率  |
|  4   | time |   datetime   | 19 |   0    |    Y     |  N   |       | 访问时间  |
|  5   | region |   varchar   | 255 |   0    |    Y     |  N   |       | 登录地区  |
|  6   | state |   int   | 10 |   0    |    Y     |  N   |       | 操作状态0正常1异常2限制访问  |
|  7   | content |   varchar   | 255 |   0    |    Y     |  N   |       | 操作内容  |
**表名：** <a id="lot_system_resource">lot_system_resource</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | id  |
|  2   | cpu_producer |   varchar   | 255 |   0    |    Y     |  N   |       | CPU生产商  |
|  3   | cpu_cache |   int   | 10 |   0    |    Y     |  N   |       | CPU缓存数量  |
|  4   | cpu_system_rate |   varchar   | 255 |   0    |    Y     |  N   |       | CPU系统使用率  |
|  5   | cpu_total_rate |   varchar   | 255 |   0    |    Y     |  N   |       | CPU总的使用率  |
|  6   | cpu_user_rate |   varchar   | 255 |   0    |    Y     |  N   |       | CPU用户使用率  |
|  7   | ip |   varchar   | 255 |   0    |    Y     |  N   |       | 本地ip地址  |
|  8   | current_swap_now |   varchar   | 255 |   0    |    Y     |  N   |       | 当前交换区使用量  |
|  9   | ram_total |   varchar   | 255 |   0    |    Y     |  N   |       | 内存总量  |
|  10   | ram_usage |   varchar   | 255 |   0    |    Y     |  N   |       | 当前内存使用量  |
|  11   | current_memory_remaining |   varchar   | 255 |   0    |    Y     |  N   |       | 当前内存剩余量  |
|  12   | jvm_available_number |   int   | 10 |   0    |    Y     |  N   |       | JVM可以使用的处理器个数  |
|  13   | jvm_surplus_ram |   varchar   | 255 |   0    |    Y     |  N   |       | JVM可以使用的剩余内存  |
|  14   | jvm_total_ram |   varchar   | 255 |   0    |    Y     |  N   |       | JVM可以使用的总内存  |
|  15   | time |   datetime   | 19 |   0    |    Y     |  N   |       | 时间  |
**表名：** <a id="lot_toolbox">lot_toolbox</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | id  |
|  2   | committee_office |   varchar   | 255 |   0    |    Y     |  N   |       | 所属委办局  |
|  3   | name |   varchar   | 255 |   0    |    N     |  N   |       | 工具名称  |
|  4   | device_type |   varchar   | 255 |   0    |    Y     |  N   |       | 设备类型  |
|  5   | label |   varchar   | 255 |   0    |    Y     |  N   |       | 标签  |
|  6   | user |   varchar   | 255 |   0    |    Y     |  N   |       | 用户  |
|  7   | commit_time |   datetime   | 19 |   0    |    N     |  N   |       | 提交时间  |
**表名：** <a id="lot_user">lot_user</a>

**说明：** 用户

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | id  |
|  2   | user_name |   varchar   | 255 |   0    |    Y     |  N   |       | 用户名  |
|  3   | account |   varchar   | 255 |   0    |    Y     |  N   |       | 账号  |
|  4   | password |   varchar   | 255 |   0    |    Y     |  N   |       | 密码  |
