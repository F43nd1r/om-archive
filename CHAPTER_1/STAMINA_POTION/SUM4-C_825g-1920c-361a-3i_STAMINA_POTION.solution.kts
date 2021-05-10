
solution {
    puzzle = "P015"
    name = "INSTRUCTIONS 11"
    arm(ARM6) {
        number = 1
        position = 0 to -5
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = -2
    }
    glyph(BONDER) {
        position = 4 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = 7 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 12 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 18 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = 15 to -5
        rotation = -1
    }
    glyph(BONDER) {
        position = 17 to -10
        rotation = 0
    }
    glyph(BONDER) {
        position = 15 to -14
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 5 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 9 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 13 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 18 to -5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 15 to -8
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 15 to -9
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to -3
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -3 to -4
        rotation = -3
    }
    glyph(PROJECTION) {
        position = -8 to -1
        rotation = -5
    }
    io(INPUT) {
        index = 0
        position = -5 to -3
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 12 to -12
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -5
        rotation = 0
    }
    track {
        position = -5 to -4
        positions = listOf(5 to -1, 5 to -2, 4 to -2, 3 to -2, 2 to -1, 1 to -1, 0 to 0, -1 to 1, -2 to 2, -2 to 3, -2 to 4, -1 to 4, 0 to 4, 1 to 4, 1 to 5, 1 to 6, 2 to 6, 2 to 5, 2 to 4, 3 to 3, 4 to 2, 5 to 1, 6 to 1, 6 to 0, 7 to -1, 8 to -1, 9 to -2, 10 to -2, 10 to -1, 11 to -1, 11 to 0, 12 to 0, 12 to 1, 12 to 2, 11 to 3, 11 to 2, 11 to 1, 10 to 1, 9 to 2, 9 to 3, 10 to 3, 10 to 4, 11 to 4, 12 to 3, 13 to 2, 14 to 1, 15 to 0, 16 to -1, 17 to -1, 18 to -1, 18 to 0, 17 to 0, 16 to 1, 15 to 2, 15 to 3, 15 to 4, 15 to 5, 16 to 5, 17 to 4, 18 to 4, 19 to 3, 20 to 2, 20 to 1, 20 to 0, 21 to -1, 22 to -1, 23 to -2, 23 to -3, 22 to -3, 21 to -3, 20 to -2, 19 to -2, 19 to -3, 19 to -4, 19 to -5, 20 to -6, 20 to -7, 21 to -8, 21 to -9, 22 to -10, 23 to -10, 23 to -9, 24 to -9, 24 to -8, 24 to -7, 25 to -8, 25 to -9, 25 to -10, 24 to -10, 24 to -11, 23 to -11, 22 to -11, 21 to -11, 20 to -11, 19 to -10, 18 to -9, 17 to -9, 17 to -10, 16 to -10, 15 to -9, 14 to -8, 13 to -7, 12 to -6, 11 to -5, 10 to -4, 9 to -3, 8 to -2, 7 to -2, 6 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
            }
        }
        )
    }
}
