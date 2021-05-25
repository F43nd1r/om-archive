
solution {
    puzzle = "P096"
    name = "NEW SOLUTION 3"
    arm(ARM6) {
        number = 1
        position = -1 to -4
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to 3
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to 6
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 4 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 4 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 7
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 6 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 3
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = -5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to 7
        rotation = 1
    }
    io(OUTPUT) {
        index = 2
        position = 5 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = -2 to 6
        rotation = 5
    }
    track {
        position = -1 to -4
        positions = listOf(0 to 0, 0 to 1, 1 to 1, 1 to 2, 2 to 2, 3 to 2, 4 to 2, 5 to 2, 6 to 2, 7 to 2, 8 to 2, 8 to 3, 8 to 4, 8 to 5, 8 to 6, 8 to 7, 8 to 8, 8 to 9, 7 to 10, 6 to 11, 5 to 11, 4 to 11, 4 to 10, 4 to 9, 3 to 9, 2 to 10, 1 to 10, 0 to 10, 0 to 9, -1 to 9, -1 to 8, -1 to 7, -2 to 7, -3 to 7, -4 to 7, -5 to 7, -6 to 7, -6 to 6, -6 to 5, -5 to 4, -5 to 3, -4 to 2, -3 to 1, -2 to 0, -1 to -1, 0 to -1)
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
