
solution {
    puzzle = "P106"
    name = "W3.5"
    arm(PISTON) {
        number = 1
        position = -3 to -3
        rotation = 6
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 1 to -3
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 2 to -2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 0 to 1
        rotation = 4
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = 2 to 3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 4 to 4
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -1 to 0
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 4 to 1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 5 to 2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = -1
    }
    track {
        position = 5 to 5
        positions = listOf(-2 to -2, -3 to -2)
    }
    track {
        position = 4 to 5
        positions = listOf(0 to 0, 0 to -1, 1 to -1, 1 to 0)
    }
    track {
        position = -4 to -1
        positions = listOf(1 to -1, 1 to -2)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                retract()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(5)
                grab()
                retract()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(13)
                grab()
                retract()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                wait(1)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(17)
                grab()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(13)
                grab()
                extend()
                wait(1)
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
