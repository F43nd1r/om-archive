
solution {
    puzzle = "P100"
    name = "OVERLAP CX"
    arm(PISTON) {
        number = 1
        position = -2 to -1
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -5 to 1
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 0
        rotation = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to 1
        rotation = 4
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 1
        rotation = -1
    }
    track {
        position = -2 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                pivotClockwise()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                wait(5)
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
