
solution {
    puzzle = "P100"
    name = "OVERLAP CX"
    arm(PISTON) {
        number = 1
        position = 4 to -3
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to 0
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -2
        rotation = 4
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 1
    }
    track {
        position = 0 to -4
        positions = listOf(0 to 0, 1 to 0, 1 to 1)
    }
    track {
        position = 3 to -2
        positions = listOf(0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(11)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                retract()
                wait(3)
                pivotCounterClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                extend()
                drop()
                retract()
                grab()
                retract()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                extend()
                reset()
                wait(13)
                extendTape()
            }
        }
        )
    }
}
