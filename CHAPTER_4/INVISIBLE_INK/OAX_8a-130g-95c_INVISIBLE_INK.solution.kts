
solution {
    puzzle = "P032"
    name = "OVERLAP ACX"
    arm(ARM1) {
        number = 1
        position = 2 to 1
        rotation = -4
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = -6
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = -6
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -5
    }
    glyph(UNBONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 2 to 1
        rotation = -6
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to 2
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = 3 to 2
        rotation = 0
    }
    track {
        position = 3 to -1
        positions = listOf(-1 to 2, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
