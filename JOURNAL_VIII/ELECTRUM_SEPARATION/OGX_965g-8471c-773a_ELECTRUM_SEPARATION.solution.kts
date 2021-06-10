
solution {
    puzzle = "P103"
    name = "NEW SOLUTION 3"
    arm(ARM2) {
        number = 1
        position = -12 to 1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -8 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -7 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -7 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -6 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 5 to 0
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 5 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 1 to -3
        rotation = -2
    }
    glyph(DISPOSAL) {
        position = 7 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -11 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 2 to -4
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -7 to 0
        rotation = -1
    }
    track {
        position = -9 to 1
        positions = listOf(30 to -7, 30 to -6, 30 to -5, 31 to -5, 31 to -4, 32 to -5, 32 to -6, 31 to -6, 31 to -7, 31 to -8, 31 to -9, 30 to -9, 29 to -9, 28 to -9, 27 to -9, 26 to -9, 25 to -9, 24 to -9, 23 to -9, 22 to -9, 21 to -9, 20 to -9, 19 to -9, 18 to -9, 17 to -9, 16 to -9, 15 to -9, 14 to -9, 13 to -9, 12 to -9, 11 to -9, 10 to -9, 9 to -9, 8 to -9, 7 to -9, 6 to -9, 5 to -9, 4 to -9, 3 to -9, 2 to -9, 1 to -9, 0 to -9, -1 to -8, -2 to -7, -3 to -6, -4 to -5, -5 to -4, -6 to -3, -7 to -2, -7 to -1, -8 to 0, -8 to 1, -8 to 2, -8 to 3, -7 to 3, -6 to 3, -5 to 3, -4 to 3, -4 to 4, -3 to 4, -2 to 4, -1 to 4, 0 to 4, 1 to 4, 2 to 4, 3 to 4, 3 to 5, 4 to 5, 5 to 5, 6 to 5, 7 to 5, 8 to 5, 9 to 5, 10 to 5, 11 to 5, 12 to 5, 13 to 5, 14 to 5, 14 to 4, 13 to 4, 12 to 4, 11 to 4, 10 to 4, 9 to 4, 8 to 4, 8 to 3, 8 to 2, 7 to 2, 6 to 3, 5 to 4, 4 to 4, 4 to 3, 3 to 3, 2 to 3, 1 to 3, 0 to 3, -1 to 3, -2 to 3, -3 to 3, -3 to 2, -2 to 1, -2 to 2, -1 to 2, -1 to 1, -1 to 0, -2 to 0, -3 to 0, -4 to 1, -5 to 2, -6 to 2, -7 to 2, -7 to 1, -7 to 0, -6 to -1, -6 to -2, -5 to -3, -4 to -4, -3 to -5, -2 to -6, -1 to -7, 0 to -8, 1 to -8, 2 to -8, 3 to -8, 4 to -8, 5 to -8, 6 to -8, 7 to -8, 8 to -8, 9 to -8, 10 to -8, 11 to -8, 12 to -8, 13 to -8, 14 to -8, 15 to -8, 16 to -8, 17 to -8, 18 to -8, 19 to -8, 20 to -8, 21 to -8, 22 to -8, 23 to -8, 24 to -8, 25 to -8, 26 to -8, 27 to -8, 28 to -8, 29 to -8, 30 to -8)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                drop()
            }
        }
        )
    }
}
