
solution {
    puzzle = "P100"
    name = "OVERLAP CA"
    arm(PISTON) {
        number = 1
        position = 4 to -3
        rotation = -3
        size = 2
    }
    arm(PISTON) {
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
    glyph(UNBONDER) {
        position = 0 to 0
        rotation = 0
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
        position = 3 to -2
        positions = listOf(0 to -1, 1 to -1, 0 to 0)
    }
    track {
        position = 0 to 0
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 0 to -4
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 1)
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
                back()
                grab()
                pivotClockwise()
                forward()
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
                forward()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
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
                wait(5)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                back()
                extend()
                wait(8)
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                retract()
                back()
                back()
                reset()
            }
        }
        )
    }
}
