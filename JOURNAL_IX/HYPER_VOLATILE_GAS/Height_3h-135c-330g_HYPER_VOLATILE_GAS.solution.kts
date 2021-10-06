
solution {
    puzzle = "P106"
    name = "H"
    arm(ARM1) {
        number = 1
        position = -4 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to -2
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 2 to -2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 1 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 5 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 8 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 12 to -2
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 7 to 0
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 9 to -2
        rotation = 6
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -1
        rotation = -4
    }
    track {
        position = 4 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -4 to -1
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 2 to -1)
    }
    track {
        position = 10 to -1
        positions = listOf(-2 to 1, -1 to 1, 0 to 1, 1 to 0, 0 to 0, 1 to -1, 2 to -1, 3 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                retract()
                wait(2)
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
            sequence(5) {
                wait(11)
                back()
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                drop()
                wait(2)
                back()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                forward()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(11)
                grab()
                pivotClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(16)
                grab()
                pivotCounterClockwise()
                forward()
                forward()
                forward()
                reset()
                wait(3)
                grab()
                pivotCounterClockwise()
                forward()
                drop()
                wait(3)
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(21)
                grab()
                forward()
                pivotCounterClockwise()
                back()
                back()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
