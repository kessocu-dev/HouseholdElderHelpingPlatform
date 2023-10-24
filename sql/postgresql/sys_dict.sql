/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : PostgreSQL
 Source Server Version : 150004 (150004)
 Source Host           : localhost:5432
 Source Catalog        : helperdb
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 150004 (150004)
 File Encoding         : 65001

 Date: 24/10/2023 17:43:05
*/


-- ----------------------------
-- Table structure for sys_dict
-- ----------------------------
DROP TABLE IF EXISTS "public"."sys_dict";
CREATE TABLE "public"."sys_dict" (
  "id" int4 NOT NULL DEFAULT nextval('sys_dict_id_seq'::regclass),
  "time" date DEFAULT date_trunc('day'::text, now()),
  "enum" jsonb
)
;
COMMENT ON COLUMN "public"."sys_dict"."id" IS '主键id 自增';
COMMENT ON COLUMN "public"."sys_dict"."time" IS '创建时间';
COMMENT ON COLUMN "public"."sys_dict"."enum" IS '字典';

-- ----------------------------
-- Records of sys_dict
-- ----------------------------
INSERT INTO "public"."sys_dict" VALUES (5, '2023-10-24', '{"enum": "轻微", "module": "health", "enum_id": 1}');
INSERT INTO "public"."sys_dict" VALUES (6, '2023-10-24', '{"enum": "一般", "module": "health", "enum_id": 2}');
INSERT INTO "public"."sys_dict" VALUES (7, '2023-10-24', '{"enum": "严重", "module": "health", "enum_id": 1}');

-- ----------------------------
-- Primary Key structure for table sys_dict
-- ----------------------------
ALTER TABLE "public"."sys_dict" ADD CONSTRAINT "sys_dict_pkey" PRIMARY KEY ("id");
