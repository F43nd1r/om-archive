
solution {
    puzzle = "P106"
    name = "H3"
    arm(ARM1) {
        number = 1
        position = -14 to 1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -8 to 0
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -9 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -5 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -2 to 1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -8 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -8 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -9 to 1
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -11 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 1
        rotation = 6
    }
    track {
        position = -6 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 1 to 0
        positions = listOf(1 to 1, 0 to 1, -1 to 1, -2 to 1, -3 to 1)
    }
    track {
        position = -13 to 1
        positions = listOf(0 to -1, 1 to -1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                back()
                back()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                retract()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                pivotClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(12)
                back()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                forward()
                drop()
                wait(3)
                back()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(18)
                grab()
                back()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                wait(2)
                back()
                wait(2)
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(27)
                grab()
                back()
                pivotCounterClockwise()
                back()
                back()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
