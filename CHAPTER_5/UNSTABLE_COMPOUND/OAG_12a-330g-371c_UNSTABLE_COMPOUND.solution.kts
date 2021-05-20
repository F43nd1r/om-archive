
solution {
    puzzle = "P040"
    name = "OVERLAP AC"
    arm(PISTON) {
        number = 1
        position = 0 to 1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 3
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 1
        rotation = -4
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to 1
        rotation = -6
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to 2
        rotation = -8
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 0
        rotation = -5
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 1
        rotation = -7
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 2
        rotation = -8
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 1
        rotation = -10
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 1
        rotation = -6
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 1
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    track {
        position = -3 to 1
        positions = listOf(1 to 1, 1 to 0, 2 to 0, 3 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                back()
                back()
                extend()
                drop()
                retract()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                extend()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
