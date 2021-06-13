
solution {
    puzzle = "w2450508212"
    name = "NEW SOLUTION 1"
    arm(ARM1) {
        number = 1
        position = -1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 2 to 3
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -2 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -2 to -3
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to -3
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 4
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = -3
    }
    track {
        position = 1 to 3
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 2 to 1)
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = -2 to -3
        positions = listOf(0 to 0, 0 to -1, -1 to -1)
    }
    track {
        position = 0 to 2
        positions = listOf(0 to 0, 0 to -1, -1 to -1)
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                back()
                back()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                forward()
                grab()
                wait(1)
                forward()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(13)
                back()
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
