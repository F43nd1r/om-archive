
solution {
    puzzle = "P061"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = 1 to -2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 5
    }
    glyph(BONDER) {
        position = 7 to -10
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 8 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -4
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to 0
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = 4 to 0
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 6 to -2
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 7 to -2
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = -3
    }
    io(INFINITE) {
        index = 0
        position = -12 to -10
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 1
        rotation = 0
    }
    track {
        position = -4 to -5
        positions = listOf(5 to 3, 4 to 3, 4 to 2, 3 to 2, 2 to 2, 3 to 1, 4 to 1, 5 to 1, 5 to 0, 4 to 0, 3 to 0, 2 to 0, 2 to 1, 1 to 2, 0 to 3, -1 to 3, -1 to 4, -2 to 4, -2 to 5, -1 to 5, -2 to 6, -1 to 6, -1 to 7, 0 to 7, 0 to 8, 1 to 7, 2 to 7, 3 to 7, 4 to 7, 5 to 7, 4 to 8, 5 to 8, 6 to 7, 7 to 6, 7 to 7, 8 to 7, 9 to 6, 10 to 6, 10 to 7, 11 to 6, 12 to 6, 12 to 5, 11 to 5, 12 to 4, 13 to 4, 13 to 3, 12 to 3, 13 to 2, 14 to 2, 14 to 1, 13 to 1, 13 to 0, 12 to 0, 12 to -1, 13 to -2, 12 to -2, 11 to -1, 10 to -1, 11 to -2, 10 to -2, 9 to -1, 8 to -1, 8 to 0, 8 to 1, 7 to 2, 6 to 3)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
                forward()
            }
        }
        )
    }
}
