/* mime type groups */
INSERT INTO mime_type_groups (mime_type_group_name, mime_type_group_description) VALUES ('Automatic', 'Default mime group to allow service to select the appropriate mime type group');
INSERT INTO mime_type_groups (mime_type_group_name, mime_type_group_description) VALUES ('Mixed', 'Mime group designated for any combination of video, image, text, audio');
INSERT INTO mime_type_groups (mime_type_group_name, mime_type_group_description) VALUES ('Videos', 'Mime group designated for video data types.');
INSERT INTO mime_type_groups (mime_type_group_name, mime_type_group_description) VALUES ('Images', 'Mime group designated for image data types.');
INSERT INTO mime_type_groups (mime_type_group_name, mime_type_group_description) VALUES ('Text', 'Mime group designated for text data types.');
INSERT INTO mime_type_groups (mime_type_group_name, mime_type_group_description) VALUES ('Audio', 'Mime group designated for audio data types.');

/* caption types */
INSERT INTO caption_types (caption_type_name, caption_type_description, mime_type_group_id) 
VALUES ('Gallery Captions', 'Captions related to the gallery containers.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Automatic'));
INSERT INTO caption_types (caption_type_name, caption_type_description, mime_type_group_id) 
VALUES ('Image Captions', 'Captions related to the image files or image containers',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Images'));
INSERT INTO caption_types (caption_type_name, caption_type_description, mime_type_group_id) 
VALUES ('Video Captions', 'Captions related to the video files or video containers',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));
INSERT INTO caption_types (caption_type_name, caption_type_description, mime_type_group_id) 
VALUES ('Audio Captions', 'Captions related to the audio files or audio containers',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Audio'));
INSERT INTO caption_types (caption_type_name, caption_type_description, mime_type_group_id) 
VALUES ('Text Captions', 'Captions related to the text files or text containers',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Text'));

/* mime types */ 

/* image mime types*/
INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('bmp', 'image/bmp', 'Bitmap, raster graphics image file format used to store digital image data.', 
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Images'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('gif', 'image/gif',	'Graphics Interchange Format',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Images'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('jp2', 'image/jp2',	'Joint Photographic Experts Group 2000 Standard.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Images'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('jpx', 'image/jpx',	'Joint Photographic Experts Group 2000 Standard.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Images'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('jpm', 'image/jpm',	'Joint Photographic Experts Group 2000 Standard.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Images'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('jpf', 'image/jpf', 'Joint Photographic Experts Group 2000 Standard.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Images'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('j2k', 'image/j2k', 'Joint Photographic Experts Group 2000 Standard.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Images'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('png', 'image/png',	'Portable Network Graphic.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Images'));

/* video mime types */
INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('mj2', 'video/mj2', 'Joint Photographic Experts Group Motion JPEG 2000',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('mjp2',	'video/mjp2', 'Joint Photographic Experts Group Motion JPEG 2000',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('3gpp', 'video/3gpp', 'Multimedia container extended from MPEG-4 Part 12, defined by the Third Generation Partnership Project. Designed for GSM-Based phones.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('3gpp2', 'video/3gpp2', 'Mulitimedia container extended from MPEG-4 Part 12, defined for the purposes of CDMA-Based phones, by the Third Generation Partnership Project.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('BMPEG', 'video/BMPEG', '',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('H261', 'video/H261', '',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('H263', 'video/H263', '',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('H263-1998', 'video/H263-1998', '',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('H263-2000', 'video/H263-2000', '',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('H264', 'video/H264', 'MPEG-4 Part 10, Advanced Video Coding. Supports resolutions up to 8192x4320, including 8K UHD. Developed by the Motion Picture Expert Group and Video Coding Expert Group.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('H264-SVC', 'video/H264-SVC', 'MPEG-4, Scalable Video Coding.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('H265', 'video/H265', 'MPEG-H Part 2, High Efficency Video Coding (HEVC). Supports resolutions up to 8192x4320, include 8K UHD. Developed by the Motion Picture Expert Group and Video Coding Expert Group.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('JPEG', 'video/JPEG', 'Joint Photographic Experts Group Motion JPEG',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('jpeg2000', 'video/jpeg2000', 'Joint Photographic Experts Group Motion JPEG 2000',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('mp4', 'video/mp4', 'Coding of audio-visual objects developed by the Motion Picture Expert Group.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('MPV', 'video/MPV', '',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('mpeg', '', 'Coding of moving pictures and associated audio for digital storage media at up to about 1.5 Mbit/s developed by the Motion Picture Expert Group.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('mpeg4-generic', 'video/mpeg4-generic', 'Coding of audio-visual objects developed by the Motion Picture Expert Group.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('ogg', 'video/ogg', 'Free open container format maintained by Xiph.Org Foundation.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('ogv', 'video/ogg', 'Free open video container format maintained by Xiph.Org Foundation.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('ogx', 'video/ogg', 'Free open Macintosh container format for video files, maintained by Xiph.Org Foundation.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('ogm', 'video/ogg', 'Free open Windows container format for video files, maintained by Xiph.Org Foundation.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('mov', 'video/quicktime', 'Video media container associated with Apple Quicktime.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));

INSERT INTO mime_types (mime_type_name, mime_type_template, mime_type_description, mime_type_group_id)
VALUES ('qt', 'video/quicktime', 'Video media container associated with Apple Quicktime.',
(SELECT mime_type_group_id FROM mime_type_groups WHERE mime_type_group_name='Videos'));
