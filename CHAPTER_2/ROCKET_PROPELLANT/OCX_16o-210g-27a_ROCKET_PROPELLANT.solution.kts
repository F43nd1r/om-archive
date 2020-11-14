
solution {
    puzzle = "P019"
    name = "OVERLAP A"
    arm(PISTON) {
        number = 1
        position = 0 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 3
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = 5
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to -2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 0 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to -1, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                forward()
                back()
                retract()
                wait(1)
                forward()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
