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

 Date: 24/10/2023 17:43:14
*/


-- ----------------------------
-- Table structure for user_elder_illness
-- ----------------------------
DROP TABLE IF EXISTS "public"."user_elder_illness";
CREATE TABLE "public"."user_elder_illness" (
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "illness" jsonb,
  "info_id" int4,
  "id" int4 NOT NULL DEFAULT nextval('user_elder_illness_id_seq'::regclass)
)
;
COMMENT ON COLUMN "public"."user_elder_illness"."name" IS '老人姓名';
COMMENT ON COLUMN "public"."user_elder_illness"."illness" IS '老人身体情况';
COMMENT ON COLUMN "public"."user_elder_illness"."info_id" IS '老人id';
COMMENT ON COLUMN "public"."user_elder_illness"."id" IS '自增id';

-- ----------------------------
-- Records of user_elder_illness
-- ----------------------------
INSERT INTO "public"."user_elder_illness" VALUES ('赵森森', '{"肾亏": "2", "糖尿病": "1", "高血压": "3"}', 1, 1);
INSERT INTO "public"."user_elder_illness" VALUES ('沈谈天', '{"肾亏": "1", "糖尿病": "1", "高血压": "3"}', 3, 4);
INSERT INTO "public"."user_elder_illness" VALUES ('邹子', '{"糖尿病": "3", "高血脂": "2", "慢性咽炎": "1"}', 2, 2);

-- ----------------------------
-- Primary Key structure for table user_elder_illness
-- ----------------------------
ALTER TABLE "public"."user_elder_illness" ADD CONSTRAINT "user_elder_illness_pkey" PRIMARY KEY ("id");
