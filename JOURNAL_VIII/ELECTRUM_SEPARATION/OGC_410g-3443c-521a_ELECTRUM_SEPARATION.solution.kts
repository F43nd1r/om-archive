
solution {
    puzzle = "P103"
    name = "3I"
    arm(ARM1) {
        number = 1
        position = -3 to 2
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 6 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -3
        rotation = 5
    }
    glyph(UNBONDER) {
        position = 8 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to 1
        rotation = 4
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 9 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 9 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 4 to 2
        rotation = 1
    }
    track {
        position = -3 to 2
        positions = listOf(5 to 2, 4 to 2, 3 to 2, 3 to 1, 3 to 0, 2 to 0, 1 to 0, 0 to 0, 0 to -1, 1 to -1, 2 to -1, 3 to -1, 4 to -2, 4 to -1, 4 to 0, 4 to 1, 5 to 1, 6 to 1, 6 to 2, 7 to 1, 8 to 1, 9 to 1, 10 to 1, 11 to 1, 12 to 1, 13 to 1, 14 to 1, 15 to 1, 16 to 1, 17 to 1, 18 to 1, 19 to 1, 20 to 1, 21 to 1, 22 to 1, 23 to 1, 24 to 0, 25 to 0, 26 to 0, 27 to 0, 26 to 1, 25 to 1, 24 to 1, 23 to 2, 22 to 2, 21 to 2, 20 to 2, 19 to 2, 18 to 2, 17 to 2, 16 to 2, 15 to 2, 14 to 2, 13 to 2, 12 to 2, 11 to 2, 10 to 2, 9 to 2, 8 to 2, 7 to 2, 6 to 3, 5 to 3)
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
