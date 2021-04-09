# fire数据库文档

**数据库名：** yingji

**文档版本：** 0.0.1-SNAPSHOT

**文档描述：** 数据库文档生成



| 表名                  | 说明       | 记录数 |
| :-------------------- | ---------- | --------------------- |
| [dutyinfo_all](#dutyinfo_all) | 值班信息市级及两区两县信息 | 622 |
| [dutyinfo_benji](#dutyinfo_benji) | 值班信息--市应急局 | 731 |
| [dutyinfo_donggang](#dutyinfo_donggang) | 值班信息--东港区应急局 | 667 |
| [dutyinfo_juxian](#dutyinfo_juxian) | 值班信息--莒县应急局 | 683 |
| [dutyinfo_lanshan](#dutyinfo_lanshan) | 值班信息--岚山区应急局 | 660 |
| [dutyinfo_wulian](#dutyinfo_wulian) | 值班信息--五莲县应急局 | 611 |
| [EmergencyShelterInfo](#EmergencyShelterInfo) |  | 160 |
| [exercise_actual_access](#exercise_actual_access) | 应急演练-实战考核-演练考核 | 3 |
| [exercise_actual_assess_member](#exercise_actual_assess_member) | 应急演练-实战考核-评估组成员 | 3 |
| [exercise_plan](#exercise_plan) | 演练计划 | 26 |
| [exercise_process](#exercise_process) | 演练流程 | 53 |
| [exercise_process_node](#exercise_process_node) | 演练流程节点 | 504 |
| [exercise_process_node_course](#exercise_process_node_course) | 演练过程 | 58 |
| [exercise_review](#exercise_review) | 应急演练-复盘演练 | 3 |
| [GeoDisaster](#GeoDisaster) | 地质灾害隐患点--来源自规局官网-地质资料-地质环境资料（2017-04-01日发布） | 111 |
| [groups](#groups) | 分组 | 92 |
| [members](#members) | 成员 | 190 |
| [row](#row) |  |  |
| [SafetyAccident](#SafetyAccident) | 安全事故--历史事故 | 357 |
| [typical_case](#typical_case) |  | 11 |
| [yingji_case_danger_duty](#yingji_case_danger_duty) | 危险区域预警转移一对一责任划分表 | 260 |
| [yingji_case_defense](#yingji_case_defense) | 防汛防台防御重点 | 166 |
| [yingji_case_duty](#yingji_case_duty) | 应急预案职责分工 | 1506 |
| [yingji_case_info](#yingji_case_info) | 应急预案基本信息 | 2867 |
| [yingji_case_transfer_flood](#yingji_case_transfer_flood) | 防汛责任人 | 2 |
| [yingji_case_transfer_info](#yingji_case_transfer_info) | 转移避险路线图 | 101 |
| [yingji_fire_safe](#yingji_fire_safe) | 应急消防安全 |  |
| [yingji_reported](#yingji_reported) | 应急上报 |  |
| [yingji_reported_status](#yingji_reported_status) | 应急上报-事件状态 |  |
| [yingji_resource_goods](#yingji_resource_goods) | 应急资源-应急物资 |  |
| [yingji_resource_shelter](#yingji_resource_shelter) | 应急资源-避难场所 |  |
| [yingji_risk_point](#yingji_risk_point) | 应急风险点 |  |
| [yjj_contacts](#yjj_contacts) | 应急局通讯录 |  |
| [yjj_law_copy1](#yjj_law_copy1) | 法律法规--备份（此表中含了应急知识内容，知识另有一表） |  |
| [yjj_rescue_station](#yjj_rescue_station) |  |  |
| [yj_earthquake_monitor](#yj_earthquake_monitor) | 地震监测 |  |
| [yj_equipment](#yj_equipment) | 应急装备--数据来自来自市应急局统计科室：救援协调和预案管理科（日照市防汛预案体系应急装备情况统计汇总） |  |
| [yj_equipment_lonlat](#yj_equipment_lonlat) |  |  |
| [yj_event](#yj_event) | 事件描述 |  |
| [yj_event_approve](#yj_event_approve) | 事件批示 |  |
| [yj_event_assess](#yj_event_assess) |  |  |
| [yj_event_deal](#yj_event_deal) | 事件处置 |  |
| [yj_event_report](#yj_event_report) | 事件续报 |  |
| [yj_expertinfo](#yj_expertinfo) | 应急局--应急专家信息 |  |
| [yj_expertinfo_copy1](#yj_expertinfo_copy1) | 应急局--应急专家信息 |  |
| [yj_knowledge](#yj_knowledge) | 知识管理-应急知识 |  |
| [yj_law](#yj_law) | 知识管理-法律法规 |  |
| [yj_team](#yj_team) | 应急队伍--含森防队伍点位、装备概述 |  |
| [yj_team_lonlat](#yj_team_lonlat) |  |  |
| [yuan0_area_id](#yuan0_area_id) |  |  |
| [yuan0_gw_id](#yuan0_gw_id) |  |  |
| [yuan0_uid](#yuan0_uid) | 应急预案-uid编号对应的村居预案详情 |  |
| [yuan1_jbqk](#yuan1_jbqk) | 应急预案-1-基本情况 |  |
| [yuan2_zzjg](#yuan2_zzjg) | 应急预案-2-组织机构 |  |
| [yuan3_zzfg](#yuan3_zzfg) | 应急预案-3-职责分工 |  |
| [yuan4_wxqy](#yuan4_wxqy) | 应急预案-4-危险区域概况 |  |
| [yuan5_yjzy](#yuan5_yjzy) | 应急预案-5-应急转移避险路线图-图片编号 |  |
| [yuan5_yjzy2](#yuan5_yjzy2) | 应急预案-5-转移避险路线-防御重点 |  |
| [zt_ForestFirePre](#zt_ForestFirePre) | 森林防火站点信息 |  |
**表名：** <a id="dutyinfo_all">dutyinfo_all</a>

**说明：** 值班信息市级及两区两县信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | area |   varchar   | 50 |   0    |    Y     |  N   |       | 区县  |
|  3   | date |   date   | 10 |   0    |    Y     |  N   |       | 值班时间  |
|  4   | duty_phone |   varchar   | 20 |   0    |    Y     |  N   |       | 值班电话  |
|  5   | fax |   varchar   | 20 |   0    |    Y     |  N   |       | 传真  |
|  6   | position |   varchar   | 10 |   0    |    Y     |  N   |       | 值班人职位：{0局领导，1值班长，2值班员}  |
|  7   | duty_time |   varchar   | 10 |   0    |    Y     |  N   |       | 值班时间：{0全天，1白班，2上午，3下午，4晚上}  |
|  8   | duty_man |   varchar   | 10 |   0    |    Y     |  N   |       | 值班人  |
|  9   | man_phone |   varchar   | 20 |   0    |    Y     |  N   |       | 值班人电话  |
|  10   | import_time |   date   | 10 |   0    |    Y     |  N   |       | 导入时间  |
**表名：** <a id="dutyinfo_all_11">dutyinfo_all_11</a>

**说明：** 所有值班信息--11月更新市级+两区两县

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | area |   varchar   | 50 |   0    |    Y     |  N   |       | 区县  |
|  3   | date |   date   | 10 |   0    |    Y     |  N   |       | 值班时间  |
|  4   | duty_phone |   varchar   | 20 |   0    |    Y     |  N   |       | 值班电话  |
|  5   | fax |   varchar   | 20 |   0    |    Y     |  N   |       | 传真  |
|  6   | position |   varchar   | 10 |   0    |    Y     |  N   |       | 值班人职位:{0局领导,1值班长,2值班员}  |
|  7   | duty_time |   varchar   | 10 |   0    |    Y     |  N   |       | 值班时间:{0全天,1白班,2上午,3下午,4晚上}  |
|  8   | duty_man |   varchar   | 10 |   0    |    Y     |  N   |       | 值班人  |
|  9   | man_phone |   varchar   | 50 |   0    |    Y     |  N   |       | 值班人电话  |
|  10   | import_time |   date   | 10 |   0    |    Y     |  N   |       | 导入时间  |
**表名：** <a id="dutyinfo_benji">dutyinfo_benji</a>

**说明：** 值班信息--市应急局

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | date |   date   | 10 |   0    |    Y     |  N   |       | 时间  |
|  3   | duty_phone |   varchar   | 255 |   0    |    Y     |  N   |       | 值班电话  |
|  4   | fax |   varchar   | 255 |   0    |    Y     |  N   |       | 传真  |
|  5   | position |   varchar   | 255 |   0    |    Y     |  N   |       | 值班人职位:{0局领导,1值班长,2值班员}  |
|  6   | duty_time |   varchar   | 50 |   0    |    Y     |  N   |       | 值班时间:{0全天,1白班,2上午,3下午,4晚上}  |
|  7   | duty_man |   varchar   | 255 |   0    |    Y     |  N   |       | 值班人  |
|  8   | man_phone |   varchar   | 50 |   0    |    Y     |  N   |       | 值班人电话  |
|  9   | create_time |   date   | 10 |   0    |    Y     |  N   |       | 导入时间  |
**表名：** <a id="dutyinfo_donggang">dutyinfo_donggang</a>

**说明：** 值班信息--东港区应急局

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | date |   date   | 10 |   0    |    Y     |  N   |       | 时间  |
|  3   | duty_phone |   varchar   | 255 |   0    |    Y     |  N   |       | 值班电话  |
|  4   | fax |   varchar   | 255 |   0    |    Y     |  N   |       | 传真  |
|  5   | position |   varchar   | 255 |   0    |    Y     |  N   |       | 值班人职位:{0局领导,1带班员,2值班员}  |
|  6   | duty_time |   varchar   | 50 |   0    |    Y     |  N   |       | 值班时间:{0全天,1白班,2上午,3下午,4晚上}  |
|  7   | duty_man |   varchar   | 255 |   0    |    Y     |  N   |       | 值班人  |
|  8   | man_phone |   varchar   | 50 |   0    |    Y     |  N   |       | 值班人电话  |
|  9   | create_time |   date   | 10 |   0    |    Y     |  N   |       | 导入时间  |
**表名：** <a id="dutyinfo_juxian">dutyinfo_juxian</a>

**说明：** 值班信息--莒县应急局

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | date |   date   | 10 |   0    |    Y     |  N   |       | 时间  |
|  3   | duty_phone |   varchar   | 255 |   0    |    Y     |  N   |       | 值班电话  |
|  4   | fax |   varchar   | 255 |   0    |    Y     |  N   |       | 传真  |
|  5   | position |   varchar   | 255 |   0    |    Y     |  N   |       | 值班人职位:{0局领导,1值班长,2值班员}  |
|  6   | duty_time |   varchar   | 50 |   0    |    Y     |  N   |       | 值班时间:{0全天,1白班,2上午,3下午,4晚上}  |
|  7   | duty_man |   varchar   | 255 |   0    |    Y     |  N   |       | 值班人  |
|  8   | man_phone |   varchar   | 50 |   0    |    Y     |  N   |       | 值班人电话  |
|  9   | create_time |   date   | 10 |   0    |    Y     |  N   |       | 导入时间  |
**表名：** <a id="dutyinfo_lanshan">dutyinfo_lanshan</a>

**说明：** 值班信息--岚山区应急局

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | date |   date   | 10 |   0    |    Y     |  N   |       | 时间  |
|  3   | duty_phone |   varchar   | 255 |   0    |    Y     |  N   |       | 值班电话  |
|  4   | fax |   varchar   | 255 |   0    |    Y     |  N   |       | 传真  |
|  5   | position |   varchar   | 255 |   0    |    Y     |  N   |       | 值班人职位:{0局领导,1值班长,2值班员}  |
|  6   | duty_time |   varchar   | 50 |   0    |    Y     |  N   |       | 值班时间:{0全天,1白班,2上午,3下午,4晚上}  |
|  7   | duty_man |   varchar   | 255 |   0    |    Y     |  N   |       | 值班人  |
|  8   | man_phone |   varchar   | 50 |   0    |    Y     |  N   |       | 值班人电话  |
|  9   | create_time |   date   | 10 |   0    |    Y     |  N   |       | 导入时间  |
**表名：** <a id="dutyinfo_wulian">dutyinfo_wulian</a>

**说明：** 值班信息--五莲县应急局

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | date |   date   | 10 |   0    |    Y     |  N   |       | 时间  |
|  3   | duty_phone |   varchar   | 255 |   0    |    Y     |  N   |       | 值班电话  |
|  4   | fax |   varchar   | 255 |   0    |    Y     |  N   |       | 传真  |
|  5   | position |   varchar   | 255 |   0    |    Y     |  N   |       | 值班人职位:{0局领导,1值班长,2值班员}  |
|  6   | duty_time |   varchar   | 50 |   0    |    Y     |  N   |       | 值班时间:{0全天,1白班,2上午,3下午,4晚上}  |
|  7   | duty_man |   varchar   | 255 |   0    |    Y     |  N   |       | 值班人  |
|  8   | man_phone |   varchar   | 50 |   0    |    Y     |  N   |       | 值班人电话  |
|  9   | create_time |   date   | 10 |   0    |    Y     |  N   |       | 导入时间  |
**表名：** <a id="EmergencyShelterInfo">EmergencyShelterInfo</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | name |   varchar   | 50 |   0    |    Y     |  N   |       | 场所名称  |
|  3   | address |   varchar   | 50 |   0    |    Y     |  N   |       | 地址  |
|  4   | area |   varchar   | 10 |   0    |    Y     |  N   |       | 所属辖区  |
|  5   | longitude |   varchar   | 50 |   0    |    Y     |  N   |       | 经度  |
|  6   | latitude |   varchar   | 50 |   0    |    Y     |  N   |       | 纬度  |
|  7   | department |   varchar   | 50 |   0    |    Y     |  N   |       | 管理部门  |
|  8   | build_time |   date   | 10 |   0    |    Y     |  N   |       | 建造时间  |
|  9   | proportion |   varchar   | 255 |   0    |    Y     |  N   |       | 面积（万㎡）  |
|  10   | contain |   varchar   | 255 |   0    |    Y     |  N   |       | 容纳人数（万人）  |
**表名：** <a id="exercise_actual_access">exercise_actual_access</a>

**说明：** 应急演练-实战考核-演练考核

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | project |   varchar   | 255 |   0    |    Y     |  N   |       | 评估项目  |
|  3   | indicator |   varchar   | 255 |   0    |    Y     |  N   |       | 评估指标  |
|  4   | result |   varchar   | 255 |   0    |    Y     |  N   |       | 评估结论  |
|  5   | advise |   varchar   | 255 |   0    |    Y     |  N   |       | 改进建议  |
|  6   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="exercise_actual_assess_member">exercise_actual_assess_member</a>

**说明：** 应急演练-实战考核-评估组成员

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | name |   varchar   | 50 |   0    |    Y     |  N   |       | 姓名  |
|  3   | unit |   varchar   | 255 |   0    |    Y     |  N   |       | 单位  |
|  4   | post |   varchar   | 50 |   0    |    Y     |  N   |       | 职位  |
|  5   | expertise |   varchar   | 255 |   0    |    Y     |  N   |       | 专长领域  |
|  6   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="exercise_plan">exercise_plan</a>

**说明：** 演练计划

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | type |   varchar   | 255 |   0    |    Y     |  N   |       | 计划类型  |
|  3   | plan_name |   varchar   | 255 |   0    |    Y     |  N   |       | 计划名称  |
|  4   | exercise_times |   varchar   | 30 |   0    |    Y     |  N   |       | 演练次数  |
|  5   | exercise_target |   varchar   | 255 |   0    |    Y     |  N   |       | 演练目的  |
|  6   | time |   datetime   | 19 |   0    |    Y     |  N   |       | 演练时间  |
|  7   | address |   varchar   | 255 |   0    |    Y     |  N   |       | 演练地址  |
|  8   | members |   varchar   | 255 |   0    |    Y     |  N   |       | 参演人员  |
|  9   | ask |   varchar   | 255 |   0    |    Y     |  N   |       | 演练要求  |
|  10   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="exercise_process">exercise_process</a>

**说明：** 演练流程

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | process_name |   varchar   | 255 |   0    |    Y     |  N   |       | 流程名称  |
|  3   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="exercise_process_node">exercise_process_node</a>

**说明：** 演练流程节点

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | procrss_id |   int   | 10 |   0    |    Y     |  N   |       | 流程id  |
|  3   | node_type |   varchar   | 255 |   0    |    Y     |  N   |       | 节点类型  |
|  4   | node_content |   varchar   | 255 |   0    |    Y     |  N   |       | 节点内容  |
|  5   | sort |   varchar   | 255 |   0    |    Y     |  N   |       | 节点排序  |
|  6   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="exercise_process_node_course">exercise_process_node_course</a>

**说明：** 演练过程

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | node_id |   int   | 10 |   0    |    Y     |  N   |       | 节点id  |
|  3   | time |   datetime   | 19 |   0    |    Y     |  N   |       | 时间  |
|  4   | show_line |   varchar   | 255 |   0    |    Y     |  N   |       | 演出主线  |
|  5   | role |   varchar   | 255 |   0    |    Y     |  N   |       | 角色  |
|  6   | response |   varchar   | 255 |   0    |    Y     |  N   |       | 指令报告应答  |
|  7   | active |   varchar   | 255 |   0    |    Y     |  N   |       | 动作  |
|  8   | sync_scene |   varchar   | 255 |   0    |    Y     |  N   |       | 同步场景  |
|  9   | role_active |   varchar   | 255 |   0    |    Y     |  N   |       | 角色动作  |
|  10   | remark |   varchar   | 255 |   0    |    Y     |  N   |       | 备注  |
|  11   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="exercise_review">exercise_review</a>

**说明：** 应急演练-复盘演练

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | stage |   varchar   | 255 |   0    |    Y     |  N   |       | 演练阶段  |
|  3   | start_stop_time |   varchar   | 255 |   0    |    Y     |  N   |       | 起止时间  |
|  4   | expressive |   varchar   | 255 |   0    |    Y     |  N   |       | 参演人员表现  |
|  5   | accident |   varchar   | 255 |   0    |    Y     |  N   |       | 意外情况及处置  |
|  6   | recorder |   varchar   | 255 |   0    |    Y     |  N   |       | 记录人  |
|  7   | record_type |   varchar   | 255 |   0    |    Y     |  N   |       | 记录方式  |
|  8   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="GeoDisaster">GeoDisaster</a>

**说明：** 地质灾害隐患点--来源自规局官网-地质资料-地质环境资料（2017-04-01日发布）

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | area |   varchar   | 20 |   0    |    Y     |  N   |       | 区县  |
|  3   | sign |   varchar   | 20 |   0    |    Y     |  N   |       | 编号  |
|  4   | address |   varchar   | 50 |   0    |    Y     |  N   |       | 位置  |
|  5   | longitude |   varchar   | 20 |   0    |    Y     |  N   |       | 经度  |
|  6   | latitude |   varchar   | 20 |   0    |    Y     |  N   |       | 纬度  |
|  7   | type |   varchar   | 10 |   0    |    Y     |  N   |       | 类型  |
|  8   | degree |   varchar   | 10 |   0    |    Y     |  N   |       | 危险性  |
|  9   | remark |   varchar   | 50 |   0    |    Y     |  N   |       | 备注  |
|  10   | report_time |   datetime   | 19 |   0    |    Y     |  N   |       | 上报时间  |
**表名：** <a id="groups">groups</a>

**说明：** 分组

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | id  |
|  2   | group_name |   varchar   | 20 |   0    |    Y     |  N   |       | 组名称  |
|  3   | member_name |   varchar   | 50 |   0    |    Y     |  N   |       | 成员名称，用分号分隔  |
|  4   | sort |   varchar   | 50 |   0    |    Y     |  N   |       | 排序  |
|  5   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    | 是否删除  |
**表名：** <a id="members">members</a>

**说明：** 成员

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | group_id |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | name |   varchar   | 20 |   0    |    Y     |  N   |       |   |
|  4   | port |   varchar   | 20 |   0    |    Y     |  N   |       |   |
|  5   | phone |   varchar   | 20 |   0    |    Y     |  N   |       |   |
|  6   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="row">row</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | lv |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  2   | dstartstr |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  3   | content |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  4   | valid |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  5   | dchg |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  6   | orgname |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  7   | id |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  8   | acc_addr |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  9   | org_scale |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  10   | kindtype |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  11   | district |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  12   | name |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  13   | accident_s_type |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  14   | org_industry |   varchar   | 255 |   0    |    Y     |  N   |       |   |
**表名：** <a id="SafetyAccident">SafetyAccident</a>

**说明：** 安全事故--历史事故

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | area |   varchar   | 20 |   0    |    N     |  N   |       | 行政区划  |
|  3   | name |   varchar   | 255 |   0    |    Y     |  N   |       | 事故名称  |
|  4   | type |   varchar   | 50 |   0    |    Y     |  N   |       | 事故类型  |
|  5   | class |   varchar   | 50 |   0    |    Y     |  N   |       | 事故等级  |
|  6   | charge |   varchar   | 50 |   0    |    Y     |  N   |       | 监管类型  |
|  7   | district |   varchar   | 50 |   0    |    Y     |  N   |       | 所在区域  |
|  8   | company_class |   varchar   | 50 |   0    |    Y     |  N   |       | 企业规模  |
|  9   | cause |   varchar   | 50 |   0    |    Y     |  N   |       | 事故原因  |
|  10   | lng |   varchar   | 50 |   0    |    Y     |  N   |       | 经度  |
|  11   | lat |   varchar   | 50 |   0    |    Y     |  N   |       | 纬度  |
|  12   | time |   date   | 10 |   0    |    Y     |  N   |       | 事故发生时间  |
|  13   | to_death |   varchar   | 10 |   0    |    Y     |  N   |       | 单次事故死亡人数(人)  |
|  14   | to_heavyinjury |   varchar   | 10 |   0    |    Y     |  N   |       | 重伤人数(人)  |
|  15   | to_minorinjury |   varchar   | 10 |   0    |    Y     |  N   |       | 轻伤人数(人)  |
|  16   | detail |   varchar   | 255 |   0    |    Y     |  N   |       | 事故概况  |
|  17   | economic_loss |   varchar   | 10 |   0    |    Y     |  N   |       | 经济损失(万元)  |
|  18   | update_time |   time   | 8 |   0    |    Y     |  N   |       | 更新日期  |
**表名：** <a id="typical_case">typical_case</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 编号  |
|  2   | title |   varchar   | 255 |   0    |    Y     |  N   |       | 事件名称  |
|  3   | process |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 事件经过  |
|  4   | injury |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 事故伤亡  |
|  5   | dispose |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 事故处置  |
|  6   | cause |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 事故原因  |
|  7   | exp |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 教训  |
**表名：** <a id="yanlian_1">yanlian_1</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | idx |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | xiangmu |   varchar   | 50 |   0    |    Y     |  N   |       |   |
|  3   | pingfen |   varchar   | 10 |   0    |    Y     |  N   |       |   |
|  4   | jielun |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  5   | jianyi |   varchar   | 255 |   0    |    Y     |  N   |       |   |
**表名：** <a id="yanlian_2">yanlian_2</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | idx |   int   | 10 |   0    |    Y     |  N   |       |   |
|  3   | content |   varchar   | 255 |   0    |    Y     |  N   |       |   |
**表名：** <a id="yingji_case_danger_duty">yingji_case_danger_duty</a>

**说明：** 危险区域预警转移一对一责任划分表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | case_id |   int   | 10 |   0    |    Y     |  N   |       | 应急预警id  |
|  3   | type |   varchar   | 255 |   0    |    Y     |  N   |       | 类别  |
|  4   | ranges |   varchar   | 255 |   0    |    Y     |  N   |       | 范围  |
|  5   | house_ower |   varchar   | 50 |   0    |    Y     |  N   |       | 受威区域户主名称  |
|  6   | peoples |   varchar   | 20 |   0    |    Y     |  N   |       | 受威区域居住人数  |
|  7   | houser_phone |   varchar   | 30 |   0    |    Y     |  N   |       | 受威区域户主联系方式  |
|  8   | warn_duty_name |   varchar   | 50 |   0    |    Y     |  N   |       | 预警责任人姓名  |
|  9   | warn_duty_phone |   varchar   | 50 |   0    |    Y     |  N   |       | 预警责任人联系方式  |
|  10   | transfer_duty_phone |   varchar   | 50 |   0    |    Y     |  N   |       | 转移责任人联系方式  |
|  11   | relocate_adrees |   varchar   | 255 |   0    |    Y     |  N   |       | 转移安置地点名称  |
|  12   | relocate_duty_name |   varchar   | 50 |   0    |    Y     |  N   |       | 转移安置地点责任人  |
|  13   | reloacte_duty_phone |   varchar   | 50 |   0    |    Y     |  N   |       | 转移安置地点责任人联系方式  |
|  14   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
|  15   | remark |   varchar   | 255 |   0    |    Y     |  N   |       | 备注  |
**表名：** <a id="yingji_case_defense">yingji_case_defense</a>

**说明：** 防汛防台防御重点

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | case_id |   int   | 10 |   0    |    Y     |  N   |       | 预案id  |
|  3   | type |   varchar   | 255 |   0    |    Y     |  N   |       | 受危险类型  |
|  4   | name |   varchar   | 255 |   0    |    Y     |  N   |       | 责任人姓名  |
|  5   | phone |   varchar   | 255 |   0    |    Y     |  N   |       | 责任人电话  |
|  6   | people |   varchar   | 255 |   0    |    Y     |  N   |       | 受危险人数  |
|  7   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="yingji_case_duty">yingji_case_duty</a>

**说明：** 应急预案职责分工

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | case_id |   int   | 10 |   0    |    Y     |  N   |       | 应急预案id  |
|  3   | port |   varchar   | 255 |   0    |    Y     |  N   |       | 岗位  |
|  4   | job |   varchar   | 255 |   0    |    Y     |  N   |       | 职位  |
|  5   | name |   varchar   | 255 |   0    |    Y     |  N   |       | 姓名  |
|  6   | phone |   varchar   | 255 |   0    |    Y     |  N   |       | 联系方式  |
|  7   | duty |   varchar   | 255 |   0    |    Y     |  N   |       | 职责  |
|  8   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="yingji_case_info">yingji_case_info</a>

**说明：** 应急预案基本信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | yingji_name |   varchar   | 255 |   0    |    Y     |  N   |       | 应急预案名称  |
|  3   | area |   varchar   | 255 |   0    |    Y     |  N   |       | 面积  |
|  4   | resident |   varchar   | 255 |   0    |    Y     |  N   |       | 住户  |
|  5   | peoples |   varchar   | 255 |   0    |    Y     |  N   |       | 人口  |
|  6   | dzzh |   varchar   | 255 |   0    |    Y     |  N   |       | 地质灾害点  |
|  7   | dwysl |   varchar   | 255 |   0    |    Y     |  N   |       | 低洼易受涝点  |
|  8   | wf |   varchar   | 255 |   0    |    Y     |  N   |       | 危房点  |
|  9   | tdkb |   varchar   | 255 |   0    |    Y     |  N   |       | 头顶库坝点  |
|  10   | others |   varchar   | 255 |   0    |    Y     |  N   |       | 其他点  |
|  11   | base_content |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 基本情况详情  |
|  12   | organ_content |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 组织架构详情  |
|  13   | district |   varchar   | 255 |   0    |    Y     |  N   |       | 行政区  |
|  14   | town |   varchar   | 255 |   0    |    Y     |  N   |       | 街镇  |
|  15   | village |   varchar   | 255 |   0    |    Y     |  N   |       | 村社  |
|  16   | type |   varchar   | 255 |   0    |    Y     |  N   |       | 预案类型  |
|  17   | create_time |   date   | 10 |   0    |    Y     |  N   |       | 创建时间  |
|  18   | update_time |   varchar   | 255 |   0    |    Y     |  N   |       | 更新时间  |
|  19   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="yingji_case_transfer_flood">yingji_case_transfer_flood</a>

**说明：** 防汛责任人

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | case_id |   int   | 10 |   0    |    Y     |  N   |       | 预案id  |
|  3   | port |   varchar   | 255 |   0    |    Y     |  N   |       | 职位  |
|  4   | name |   varchar   | 255 |   0    |    Y     |  N   |       | 姓名  |
|  5   | phone |   varchar   | 255 |   0    |    Y     |  N   |       | 电话  |
|  6   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="yingji_case_transfer_info">yingji_case_transfer_info</a>

**说明：** 转移避险路线图

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | case_id |   int   | 10 |   0    |    Y     |  N   |       | 应急预案id  |
|  3   | transfer_url |   varchar   | 255 |   0    |    Y     |  N   |       | 转移避嫌线路图  |
|  4   | base_info |   varchar   | 255 |   0    |    Y     |  N   |       | 基本情况  |
|  5   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="yingji_fire_safe">yingji_fire_safe</a>

**说明：** 应急消防安全

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | ID |   varchar   | 255 |   0    |    N     |  Y   |       |   |
|  2   | SMID |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  3   | SMX |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  4   | SMY |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  5   | SMLIBTILEID |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  6   | SMUSERID |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  7   | USER_SMID |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  8   | USER_SMX |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  9   | USER_SMY |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  10   | USER_SMLIBTILEI |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  11   | USERID |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  12   | USER_SMGEOMETRY |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  13   | USER_SMGEOPOSIT |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  14   | BENNUM |   varchar   | 255 |   0    |    Y     |  N   |       | 本点号  |
|  15   | GROUPTYPE |   varchar   | 255 |   0    |    Y     |  N   |       | 组分类型  |
|  16   | Y_AXIS |   varchar   | 255 |   0    |    Y     |  N   |       | 纵坐标  |
|  17   | X_AXIS |   varchar   | 255 |   0    |    Y     |  N   |       | 横坐标  |
|  18   | GROUND_LEVEL |   varchar   | 255 |   0    |    Y     |  N   |       | 地面标高  |
|  19   | FEATURE |   varchar   | 255 |   0    |    Y     |  N   |       | 特征点  |
|  20   | APPENDANT |   varchar   | 255 |   0    |    Y     |  N   |       | 附属物  |
|  21   | SPECIFICATION |   varchar   | 255 |   0    |    Y     |  N   |       | 规格  |
|  22   | TEXTURE |   varchar   | 255 |   0    |    Y     |  N   |       | 材质  |
|  23   | DEPTH |   varchar   | 255 |   0    |    Y     |  N   |       | 深埋  |
|  24   | LOCATION |   varchar   | 255 |   0    |    Y     |  N   |       | 所在位置  |
|  25   | STATUS |   varchar   | 255 |   0    |    Y     |  N   |       | 使用状态  |
|  26   | REMARK |   varchar   | 255 |   0    |    Y     |  N   |       | 备注  |
|  27   | GUID |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  28   | CREATETIME |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  29   | LASTMODIFY |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  30   | CREATEUSER |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  31   | LASTMODI_1 |   varchar   | 255 |   0    |    Y     |  N   |       |   |
**表名：** <a id="yingji_reported">yingji_reported</a>

**说明：** 应急上报

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | area |   varchar   | 255 |   0    |    Y     |  N   |       | 区域  |
|  3   | type |   varchar   | 255 |   0    |    Y     |  N   |       | 事件类型  |
|  4   | source |   varchar   | 255 |   0    |    Y     |  N   |       | 来源  |
|  5   | time |   datetime   | 19 |   0    |    Y     |  N   |       | 时间  |
|  6   | address |   varchar   | 255 |   0    |    Y     |  N   |       | 地址  |
|  7   | description |   varchar   | 255 |   0    |    Y     |  N   |       | 描述  |
|  8   | event_level |   varchar   | 255 |   0    |    Y     |  N   |       | 事件等级  |
|  9   | unit |   varchar   | 255 |   0    |    Y     |  N   |       | 所属单位  |
|  10   | die_num |   varchar   | 255 |   0    |    Y     |  N   |       | 死亡人数  |
|  11   | financial_loss |   varchar   | 255 |   0    |    Y     |  N   |       | 经济损失  |
**表名：** <a id="yingji_reported_status">yingji_reported_status</a>

**说明：** 应急上报-事件状态

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | reported_id |   int   | 10 |   0    |    Y     |  N   |       | 上报id  |
|  3   | content |   varchar   | 255 |   0    |    Y     |  N   |       | 事件进度  |
**表名：** <a id="yingji_resource_goods">yingji_resource_goods</a>

**说明：** 应急资源-应急物资

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | area |   varchar   | 20 |   0    |    Y     |  N   |       | 区域  |
|  3   | org |   varchar   | 255 |   0    |    Y     |  N   |       | 机构  |
|  4   | type |   varchar   | 20 |   0    |    Y     |  N   |       | 类型  |
|  5   | name |   varchar   | 30 |   0    |    Y     |  N   |       | 名称  |
|  6   | number |   varchar   | 10 |   0    |    Y     |  N   |       | 数量  |
|  7   | unit |   varchar   | 50 |   0    |    Y     |  N   |       | 单位  |
|  8   | save_place |   varchar   | 50 |   0    |    Y     |  N   |       | 存放场所  |
|  9   | dutyer |   varchar   | 50 |   0    |    Y     |  N   |       | 负责人  |
|  10   | phone |   varchar   | 100 |   0    |    Y     |  N   |       | 电话  |
|  11   | record_time |   date   | 10 |   0    |    Y     |  N   |       | 记录时间  |
|  12   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="yingji_resource_shelter">yingji_resource_shelter</a>

**说明：** 应急资源-避难场所

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | regional |   varchar   | 100 |   0    |    Y     |  N   |       | 区域  |
|  3   | area |   varchar   | 100 |   0    |    Y     |  N   |       | 面积  |
|  4   | peoples |   varchar   | 20 |   0    |    Y     |  N   |       | 可容纳人数  |
|  5   | depart |   varchar   | 50 |   0    |    Y     |  N   |       | 管理部门  |
|  6   | description |   varchar   | 255 |   0    |    Y     |  N   |       | 描述  |
|  7   | lng |   varchar   | 100 |   0    |    Y     |  N   |       | 精度  |
|  8   | lat |   varchar   | 100 |   0    |    Y     |  N   |       | 纬度  |
|  9   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="yingji_resource_specialist">yingji_resource_specialist</a>

**说明：** 应急资源-应急专家

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | name |   varchar   | 255 |   0    |    Y     |  N   |       | 姓名  |
|  3   | sex |   varchar   | 10 |   0    |    Y     |  N   |       | 性别  |
|  4   | post |   varchar   | 100 |   0    |    Y     |  N   |       | 职位  |
|  5   | org |   varchar   | 255 |   0    |    Y     |  N   |       | 机构名称  |
|  6   | phone |   varchar   | 30 |   0    |    Y     |  N   |       | 电话  |
|  7   | work |   varchar   | 255 |   0    |    Y     |  N   |       | 分管工作  |
|  8   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="yingji_resource_team">yingji_resource_team</a>

**说明：** 应急资源-应急队伍

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | area |   varchar   | 255 |   0    |    Y     |  N   |       | 区域  |
|  3   | unit |   varchar   | 255 |   0    |    Y     |  N   |       | 隶属单位  |
|  4   | type |   varchar   | 20 |   0    |    Y     |  N   |       | 类型  |
|  5   | address |   varchar   | 100 |   0    |    Y     |  N   |       | 地址  |
|  6   | dutyer |   varchar   | 50 |   0    |    Y     |  N   |       | 负责人  |
|  7   | phone |   varchar   | 50 |   0    |    Y     |  N   |       | 电话  |
|  8   | record_time |   date   | 10 |   0    |    Y     |  N   |       | 记录时间  |
|  9   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    |   |
**表名：** <a id="yingji_risk_point">yingji_risk_point</a>

**说明：** 应急风险点

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | name |   varchar   | 255 |   0    |    Y     |  N   |       | 名称  |
|  3   | area |   varchar   | 255 |   0    |    Y     |  N   |       | 区域  |
|  4   | address |   varchar   | 255 |   0    |    Y     |  N   |       | 地址  |
|  5   | place_type |   varchar   | 255 |   0    |    Y     |  N   |       | 类别  |
|  6   | grade |   varchar   | 255 |   0    |    Y     |  N   |       | 等级  |
|  7   | org_name |   varchar   | 255 |   0    |    Y     |  N   |       | 所属单位  |
|  8   | work_name |   varchar   | 255 |   0    |    Y     |  N   |       | 责任人  |
|  9   | assess_datestr |   varchar   | 255 |   0    |    Y     |  N   |       | 确认时间  |
|  10   | confirm_datestr |   varchar   | 255 |   0    |    Y     |  N   |       | 风险评估时间  |
|  11   | lng |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  12   | lat |   varchar   | 255 |   0    |    Y     |  N   |       |   |
**表名：** <a id="yjj_contacts">yjj_contacts</a>

**说明：** 应急局通讯录

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | area_id |   int   | 10 |   0    |    Y     |  N   |       | 区域id-排序用  |
|  3   | area |   varchar   | 50 |   0    |    Y     |  N   |       | 区域  |
|  4   | department |   varchar   | 50 |   0    |    Y     |  N   |       | 科室  |
|  5   | name |   varchar   | 50 |   0    |    Y     |  N   |       | 姓名  |
|  6   | position |   varchar   | 50 |   0    |    Y     |  N   |       | 职务  |
|  7   | office_phone |   varchar   | 50 |   0    |    Y     |  N   |       | 办公电话  |
|  8   | phone |   varchar   | 50 |   0    |    Y     |  N   |       | 手机号  |
|  9   | mail |   varchar   | 50 |   0    |    Y     |  N   |       | 邮箱  |
|  10   | create_time |   date   | 10 |   0    |    Y     |  N   |       | 创建日期  |
|  11   | update_time |   date   | 10 |   0    |    Y     |  N   |       | 更新日期  |
**表名：** <a id="yjj_law_copy1">yjj_law_copy1</a>

**说明：** 法律法规--备份（此表中含了应急知识内容，知识另有一表）

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | type |   varchar   | 50 |   0    |    Y     |  N   |       | 类型  |
|  2   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  3   | title |   varchar   | 255 |   0    |    Y     |  N   |       | 标题  |
|  4   | source |   varchar   | 20 |   0    |    Y     |  N   |       | 来源（国家发布、省级发布、市级发布）  |
|  5   | content |   text   | 65535 |   0    |    Y     |  N   |       | 内容  |
**表名：** <a id="yjj_rescue_station">yjj_rescue_station</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | site |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  3   | name |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  4   | level |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  5   | address |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  6   | lon |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  7   | lat |   varchar   | 255 |   0    |    Y     |  N   |       |   |
**表名：** <a id="yj_earthquake_monitor">yj_earthquake_monitor</a>

**说明：** 地震监测

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | type |   varchar   | 255 |   0    |    Y     |  N   |       | 类型  |
|  3   | occur_time |   datetime   | 19 |   0    |    Y     |  N   |       | 发生时间  |
|  4   | quake_level |   varchar   | 255 |   0    |    Y     |  N   |       | 震级  |
|  5   | quake_hight |   varchar   | 255 |   0    |    Y     |  N   |       | 震源深度  |
|  6   | quake_location |   varchar   | 255 |   0    |    Y     |  N   |       | 震中位置  |
|  7   | lng |   varchar   | 255 |   0    |    Y     |  N   |       | 经度  |
|  8   | lat |   varchar   | 255 |   0    |    Y     |  N   |       | 纬度  |
|  9   | description |   varchar   | 255 |   0    |    Y     |  N   |       | 描述  |
**表名：** <a id="yj_equipment">yj_equipment</a>

**说明：** 应急装备--数据来自来自市应急局统计科室：救援协调和预案管理科（日照市防汛预案体系应急装备情况统计汇总）

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 编号  |
|  2   | department |   varchar   | 50 |   0    |    Y     |  N   |       | 单位部门  |
|  3   | category |   varchar   | 50 |   0    |    Y     |  N   |       | 装备分类  |
|  4   | detail |   varchar   | 50 |   0    |    Y     |  N   |       | 装备详细类别  |
|  5   | suffix |   varchar   | 10 |   0    |    Y     |  N   |       | 数据单位  |
|  6   | cnt |   varchar   | 50 |   0    |    Y     |  N   |       | 数量  |
|  7   | count_date |   date   | 10 |   0    |    Y     |  N   |       | 统计截止时间  |
|  8   | lon |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  9   | lat |   varchar   | 255 |   0    |    Y     |  N   |       |   |
**表名：** <a id="yj_equipment_lonlat">yj_equipment_lonlat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | address |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  2   | lon |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  3   | lat |   varchar   | 255 |   0    |    Y     |  N   |       |   |
**表名：** <a id="yj_event">yj_event</a>

**说明：** 事件描述

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 事件Id  |
|  2   | type |   varchar   | 255 |   0    |    Y     |  N   |       | 事件类型  |
|  3   | address |   varchar   | 255 |   0    |    Y     |  N   |       | 事件地址  |
|  4   | source |   varchar   | 255 |   0    |    Y     |  N   |       | 事件来源  |
|  5   | time |   varchar   | 255 |   0    |    Y     |  N   |       | 事件  |
|  6   | describes |   varchar   | 255 |   0    |    Y     |  N   |       | 事件描述  |
|  7   | level |   varchar   | 255 |   0    |    Y     |  N   |       | 事件等级  |
|  8   | title |   varchar   | 255 |   0    |    Y     |  N   |       | 主题  |
|  9   | lng |   varchar   | 255 |   0    |    Y     |  N   |       | 经度  |
|  10   | lat |   varchar   | 255 |   0    |    Y     |  N   |       | 纬度  |
|  11   | remark |   varchar   | 255 |   0    |    Y     |  N   |       | 预留字段  |
|  12   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |
|  13   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    | 删除标示0-未删1-已删  |
**表名：** <a id="yj_event_approve">yj_event_approve</a>

**说明：** 事件批示

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | event_id |   varchar   | 11 |   0    |    Y     |  N   |       | 事件id(关联event表id)  |
|  3   | approve_type |   varchar   | 255 |   0    |    Y     |  N   |       | 批示类别0-指示1-落实  |
|  4   | approve_title |   varchar   | 255 |   0    |    Y     |  N   |       | 批示主题  |
|  5   | approve_time |   varchar   | 255 |   0    |    Y     |  N   |       | 批示时间  |
|  6   | approve_content |   varchar   | 255 |   0    |    Y     |  N   |       | 批示内容  |
|  7   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |
|  8   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    | 删除标示0-未删1-已删  |
**表名：** <a id="yj_event_assess">yj_event_assess</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | event_id |   varchar   | 255 |   0    |    Y     |  N   |       | 事件id(关联event表id)  |
|  3   | assess_title |   varchar   | 255 |   0    |    Y     |  N   |       | 评估主题  |
|  4   | assess_content |   varchar   | 255 |   0    |    Y     |  N   |       | 评估内容  |
|  5   | assess_time |   varchar   | 255 |   0    |    Y     |  N   |       | 评估时间  |
|  6   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |
|  7   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    | 删除标示0-未删1-已删  |
**表名：** <a id="yj_event_deal">yj_event_deal</a>

**说明：** 事件处置

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | event_id |   varchar   | 255 |   0    |    Y     |  N   |       | 事件id(关联eventinfo表id字段)  |
|  3   | deal_time |   varchar   | 255 |   0    |    Y     |  N   |       | 处置时间  |
|  4   | deal_content |   varchar   | 255 |   0    |    Y     |  N   |       | 处置内容  |
|  5   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |
|  6   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    | 删除标示0-未删1-以删  |
**表名：** <a id="yj_event_report">yj_event_report</a>

**说明：** 事件续报

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | id  |
|  2   | event_id |   varchar   | 255 |   0    |    Y     |  N   |       | 事件id(关联event表id)  |
|  3   | report_time |   varchar   | 255 |   0    |    Y     |  N   |       | 续报世界  |
|  4   | report_content |   varchar   | 255 |   0    |    Y     |  N   |       | 事件内容  |
|  5   | update_time |   datetime   | 19 |   0    |    Y     |  N   |       | 更新时间  |
|  6   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    | 删除标示0-未删1-已删  |
**表名：** <a id="yj_expertinfo">yj_expertinfo</a>

**说明：** 应急局--应急专家信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | name |   varchar   | 50 |   0    |    N     |  N   |       | 姓名  |
|  3   | sex |   varchar   | 50 |   0    |    Y     |  N   |       | 性别  |
|  4   | pot |   varchar   | 255 |   0    |    Y     |  N   |       | 职务  |
|  5   | department |   varchar   | 50 |   0    |    Y     |  N   |       | 组别  |
|  6   | phone_office |   varchar   | 50 |   0    |    Y     |  N   |       | 办公电话  |
|  7   | job |   varchar   | 50 |   0    |    Y     |  N   |       | 分管工作  |
|  8   | phone |   varchar   | 50 |   0    |    Y     |  N   |       | 移动电话  |
|  9   | update_time |   date   | 10 |   0    |    Y     |  N   |       | 更新时间  |
|  10   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    | 删除标示0-未删1-已删  |
**表名：** <a id="yj_expertinfo_copy1">yj_expertinfo_copy1</a>

**说明：** 应急局--应急专家信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | name |   varchar   | 50 |   0    |    N     |  N   |       | 姓名  |
|  3   | sex |   varchar   | 50 |   0    |    Y     |  N   |       | 性别  |
|  4   | pot |   varchar   | 255 |   0    |    Y     |  N   |       | 职务  |
|  5   | department |   varchar   | 50 |   0    |    Y     |  N   |       | 组别  |
|  6   | phone_office |   varchar   | 50 |   0    |    Y     |  N   |       | 办公电话  |
|  7   | job |   varchar   | 50 |   0    |    Y     |  N   |       | 分管工作  |
|  8   | phone |   varchar   | 50 |   0    |    Y     |  N   |       | 移动电话  |
|  9   | update_time |   date   | 10 |   0    |    Y     |  N   |       | 更新时间  |
**表名：** <a id="yj_knowledge">yj_knowledge</a>

**说明：** 知识管理-应急知识

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | type |   varchar   | 50 |   0    |    Y     |  N   |       | 类型  |
|  2   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  3   | title |   varchar   | 255 |   0    |    Y     |  N   |       | 标题  |
|  4   | content |   text   | 65535 |   0    |    Y     |  N   |       | 内容  |
|  5   | upload_time |   varchar   | 255 |   0    |    Y     |  N   |       | 上传时间  |
|  6   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    | 删除标识0-未删1-已删  |
**表名：** <a id="yj_law">yj_law</a>

**说明：** 知识管理-法律法规

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | type |   varchar   | 50 |   0    |    Y     |  N   |       | 类型  |
|  2   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  3   | title |   varchar   | 255 |   0    |    Y     |  N   |       | 标题  |
|  4   | source |   varchar   | 20 |   0    |    Y     |  N   |       | 来源（国家发布、省级发布、市级发布）  |
|  5   | content |   text   | 65535 |   0    |    Y     |  N   |       | 内容  |
|  6   | upload_time |   varchar   | 255 |   0    |    Y     |  N   |       | 上传时间  |
|  7   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    | 删除标示0-未删1-已删  |
**表名：** <a id="yj_team">yj_team</a>

**说明：** 应急队伍--含森防队伍点位、装备概述

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | category |   varchar   | 255 |   0    |    N     |  N   |       | 队伍类型  |
|  3   | property |   varchar   | 255 |   0    |    Y     |  N   |       | 属性  |
|  4   | unit |   varchar   | 255 |   0    |    Y     |  N   |       | 隶属单位  |
|  5   | area |   varchar   | 255 |   0    |    Y     |  N   |       | 所属辖区  |
|  6   | name |   varchar   | 255 |   0    |    Y     |  N   |       | 队伍名称  |
|  7   | address |   varchar   | 255 |   0    |    Y     |  N   |       | 地址  |
|  8   | cnt |   varchar   | 255 |   0    |    Y     |  N   |       | 人数  |
|  9   | person |   varchar   | 255 |   0    |    Y     |  N   |       | 联系人  |
|  10   | phone |   varchar   | 255 |   0    |    Y     |  N   |       | 电话  |
|  11   | lngitude |   varchar   | 255 |   0    |    Y     |  N   |       | 经度  |
|  12   | latitude |   varchar   | 255 |   0    |    Y     |  N   |       | 纬度  |
|  13   | department |   varchar   | 255 |   0    |    Y     |  N   |       | 主管部门  |
|  14   | duty_phone |   varchar   | 255 |   0    |    Y     |  N   |       | 值班电话  |
|  15   | detail |   varchar   | 255 |   0    |    Y     |  N   |       | 主要应急装备  |
|  16   | remark |   varchar   | 255 |   0    |    Y     |  N   |       | 备注  |
|  17   | count_date |   varchar   | 255 |   0    |    Y     |  N   |       | 统计截止时间  |
|  18   | is_del |   int   | 10 |   0    |    Y     |  N   |   0    | 删除标示0-未删1-已删  |
**表名：** <a id="yj_team_lonlat">yj_team_lonlat</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | name |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  2   | address |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  3   | lon |   varchar   | 255 |   0    |    Y     |  N   |       |   |
|  4   | lat |   varchar   | 255 |   0    |    Y     |  N   |       |   |
**表名：** <a id="yuan0_area_id">yuan0_area_id</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | area_id |   varchar   | 50 |   0    |    Y     |  N   |       | 区县id  |
|  3   | district |   varchar   | 50 |   0    |    Y     |  N   |       | 区县  |
**表名：** <a id="yuan0_gw_id">yuan0_gw_id</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | gw_id |   varchar   | 20 |   0    |    Y     |  N   |       | 岗位分组编号  |
|  3   | group |   varchar   | 20 |   0    |    N     |  N   |       | 岗位分组  |
|  4   | duty |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 主要职责  |
**表名：** <a id="yuan0_uid">yuan0_uid</a>

**说明：** 应急预案-uid编号对应的村居预案详情

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | uid |   int   | 10 |   0    |    N     |  Y   |       | 预案编号  |
|  3   | area_id |   varchar   | 20 |   0    |    Y     |  N   |       | 区域id{1东港区,2高新区,3莒县,4开发区,5岚山区,6山海天,7五莲}  |
|  4   | street |   varchar   | 255 |   0    |    Y     |  N   |       | 镇/街道  |
|  5   | community |   varchar   | 255 |   0    |    Y     |  N   |       | 村/社区  |
|  6   | type |   varchar   | 50 |   0    |    Y     |  N   |       | 预案类型  |
|  7   | create_time |   date   | 10 |   0    |    Y     |  N   |       | 预案编写时间  |
|  8   | update_time |   date   | 10 |   0    |    Y     |  N   |       | 更新时间  |
|  9   | import_time |   date   | 10 |   0    |    Y     |  N   |       | 数据导入时间  |
**表名：** <a id="yuan1_jbqk">yuan1_jbqk</a>

**说明：** 应急预案-1-基本情况

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | uid |   int   | 10 |   0    |    N     |  Y   |       | 预案编号  |
|  3   | area |   varchar   | 255 |   0    |    Y     |  N   |       | 辖区面积（单位：平方公里）  |
|  4   | household |   varchar   | 255 |   0    |    Y     |  N   |       | 住户数  |
|  5   | population |   varchar   | 255 |   0    |    Y     |  N   |       | 人口  |
|  6   | dzzh |   varchar   | 255 |   0    |    Y     |  N   |       | 地质灾害隐患点  |
|  7   | dwysl |   varchar   | 255 |   0    |    Y     |  N   |       | 低洼易受涝点  |
|  8   | wf |   varchar   | 255 |   0    |    Y     |  N   |       | 危房点  |
|  9   | tdkb |   varchar   | 255 |   0    |    Y     |  N   |       | 头顶库坝点  |
|  10   | others |   varchar   | 255 |   0    |    Y     |  N   |       | 其他类型灾害点  |
|  11   | detail |   varchar   | 255 |   0    |    Y     |  N   |       | 基本情况详情  |
**表名：** <a id="yuan2_zzjg">yuan2_zzjg</a>

**说明：** 应急预案-2-组织机构

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | uid |   int   | 10 |   0    |    N     |  Y   |       | 预案编号  |
|  3   | detail |   longtext   | 2147483647 |   0    |    Y     |  N   |       | 组织机构详情描述  |
**表名：** <a id="yuan3_zzfg">yuan3_zzfg</a>

**说明：** 应急预案-3-职责分工

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | uid |   int   | 10 |   0    |    N     |  Y   |       | 预案编号  |
|  3   | gw_id |   varchar   | 50 |   0    |    Y     |  N   |       | 岗位分组（1:乡镇（街道）包村干部;；2:总组长；3:监测预警组；4:转移避险组；5:防洪抢险组）  |
|  4   | job |   varchar   | 255 |   0    |    Y     |  N   |       | 岗位  |
|  5   | name |   varchar   | 255 |   0    |    Y     |  N   |       | 责任人姓名  |
|  6   | phone |   varchar   | 255 |   0    |    Y     |  N   |       | 责任人电话  |
**表名：** <a id="yuan4_wxqy">yuan4_wxqy</a>

**说明：** 应急预案-4-危险区域概况

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | uid |   int   | 10 |   0    |    N     |  Y   |       | 预案编号  |
|  3   | range |   varchar   | 255 |   0    |    Y     |  N   |       | 危险区域范围  |
|  4   | type |   varchar   | 255 |   0    |    Y     |  N   |       | 受威胁类型  |
|  5   | name |   varchar   | 255 |   0    |    Y     |  N   |       | 责任人姓名  |
|  6   | phone |   varchar   | 255 |   0    |    Y     |  N   |       | 责任人手机  |
|  7   | remark |   varchar   | 255 |   0    |    Y     |  N   |       | 备注  |
**表名：** <a id="yuan5_yjzy">yuan5_yjzy</a>

**说明：** 应急预案-5-应急转移避险路线图-图片编号

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | uid |   int   | 10 |   0    |    N     |  Y   |       | 预案编号  |
|  3   | status |   varchar   | 255 |   0    |    Y     |  N   |       | 基本情况  |
|  4   | pic_id |   varchar   | 255 |   0    |    Y     |  N   |       | 转移路线图id  |
|  5   | type |   varchar   | 255 |   0    |    Y     |  N   |       | 预案类型  |
**表名：** <a id="yuan5_yjzy2">yuan5_yjzy2</a>

**说明：** 应急预案-5-转移避险路线-防御重点

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | uid |   int   | 10 |   0    |    N     |  Y   |       | 预案编号  |
|  3   | type |   varchar   | 255 |   0    |    Y     |  N   |       | 受威胁类型  |
|  4   | name |   varchar   | 255 |   0    |    Y     |  N   |       | 责任人姓名  |
|  5   | phone |   varchar   | 255 |   0    |    Y     |  N   |       | 责任人电话  |
|  6   | detail |   varchar   | 255 |   0    |    Y     |  N   |       | 受威胁人数  |
**表名：** <a id="zt_ForestFirePre">zt_ForestFirePre</a>

**说明：** 森林防火站点信息

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :--: | :--- | :------: | :----: | :----: | :------: | :--: | :----: | :--: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       |   |
|  2   | area |   varchar   | 255 |   0    |    Y     |  N   |       | 区域  |
|  3   | project |   varchar   | 255 |   0    |    Y     |  N   |       | 项目名称  |
|  4   | platform |   varchar   | 255 |   0    |    N     |  N   |       | 平台名称  |
|  5   | longitude |   varchar   | 255 |   0    |    Y     |  N   |       | 经度  |
|  6   | latitude |   varchar   | 255 |   0    |    Y     |  N   |       | 纬度  |
|  7   | update_time |   date   | 10 |   0    |    Y     |  N   |       | 更新时间（此表目前为手动导库）  |
