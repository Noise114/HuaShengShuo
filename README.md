# HuaShengShuo
#数据库表结构
-- 手机基础数据表
CREATE TABLE mobile_basic_data (
    model_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '机型id',
    model_name VARCHAR(255) COMMENT '机型名称',
    release_date DATE COMMENT '发布日期',
    processor_model VARCHAR(255) COMMENT '处理器型号',
    starting_price DECIMAL(12, 2) COMMENT '起售价格',
    test_version VARCHAR(255) COMMENT '测试版本',
    battery_capacity INT COMMENT '电池容量',
    screen_size DECIMAL(4, 2) COMMENT '屏幕尺寸',
    thickness DECIMAL(4, 2) COMMENT '机身厚度',
    weight DECIMAL(6, 2) COMMENT '机身重量',
    charging_power INT COMMENT '充电功率',
    remarks TEXT COMMENT '备注',
    creation_date DATE COMMENT '创建日期',
    update_date DATE COMMENT '更新日期'
);

-- 充电数据表
CREATE TABLE charging_data (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
    model_id INT COMMENT '机型id',
    charging_time DATETIME COMMENT '充电时间',
    full_charge_time DATETIME COMMENT '手机完全充满时间',
    creation_date DATE COMMENT '创建日期',
    update_date DATE COMMENT '更新日期'
);

-- 屏幕数据表
CREATE TABLE screen_data (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
    model_id INT COMMENT '机型id',
    manual_max_brightness INT COMMENT '手动最高亮度',
    brightness_uniformity DECIMAL(12, 2) COMMENT '亮度均匀性',
    global_illumination INT COMMENT '全局激发亮度',
    screen_power_consumption DECIMAL(12, 2) COMMENT '屏幕功耗',
    creation_date DATE COMMENT '创建日期',
    update_date DATE COMMENT '更新日期'
);

-- 手机续航数据表
CREATE TABLE battery_life_data (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
    model_id INT COMMENT '机型id',
    honor_of_kings_power_consumption DECIMAL(12, 2) COMMENT '王者荣耀耗电量',
    genshin_impact_power_consumption DECIMAL(12, 2) COMMENT '原神耗电量',
    photography_power_consumption DECIMAL(12, 2) COMMENT '拍照耗电量',
    bilibili_power_consumption DECIMAL(12, 2) COMMENT '哔哩哔哩耗电量',
    standby_power_consumption DECIMAL(12, 2) COMMENT '待机耗电量',
    weibo_power_consumption DECIMAL(12, 2) COMMENT '微博耗电量',
    pubg_power_consumption DECIMAL(12, 2) COMMENT '吃鸡耗电量',
    remaining_battery DECIMAL(12, 2) COMMENT '剩余电量',
    creation_date DATE COMMENT '创建日期',
    update_date DATE COMMENT '更新日期'
);

-- 游戏基础信息表
CREATE TABLE game_basic_info (
    game_id INT PRIMARY KEY COMMENT '游戏id',
    game_name VARCHAR(255) COMMENT '游戏名称',
    creation_date DATE COMMENT '创建日期',
    update_date DATE COMMENT '更新日期'
);

-- 游戏数据表
CREATE TABLE game_data (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
    model_id INT COMMENT '机型id',
    game_id INT COMMENT '游戏id',
    frame_rate DECIMAL(12, 2) COMMENT '帧率',
    power_consumption DECIMAL(12, 2) COMMENT '功耗',
    frame_rate_image_url VARCHAR(255) COMMENT '帧率图片地址',
    power_consumption_image_url VARCHAR(255) COMMENT '功耗图片地址',
    temperature_front_image_url VARCHAR(255) COMMENT '温度正面图片地址',
    temperature_side_image_url VARCHAR(255) COMMENT '温度侧面图片地址',
    temperature_back_image_url VARCHAR(255) COMMENT '温度背面面图片地址',
    creation_date DATE COMMENT '创建日期',
    update_date DATE COMMENT '更新日期'
);

-- 性能数据表
CREATE TABLE performance_data (
    id INT PRIMARY KEY AUTO_INCREMENT COMMENT 'id',
    app_open_speed_25 DECIMAL(12, 2) COMMENT '25个应用打开速度',
    app_background_retain_25 INT COMMENT '25个应用后台保留数',
    geekbench6_single_core_score INT COMMENT 'geekbench6单核跑分',
    geekbench6_multi_core_score INT COMMENT 'geekbench6多核跑分',
    antutu_score INT COMMENT '安兔兔跑分',
    creation_date DATE COMMENT '创建日期',
    update_date DATE COMMENT '更新日期'
);
