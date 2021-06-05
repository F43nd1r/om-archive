
solution {
    puzzle = "P030b"
    name = "OAC"
    arm(ARM1) {
        number = 1
        position = -2 to 1
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 2
        rotation = 0
    }
    track {
        position = -3 to 2
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
