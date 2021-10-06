
solution {
    puzzle = "P106"
    name = "H"
    arm(ARM1) {
        number = 1
        position = -4 to -1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = 2 to -2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 1 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 5 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 9 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 8 to 0
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
        position = 2 to -1
        rotation = -1
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
        positions = listOf(2 to -1, 1 to -1, 0 to 0, 1 to 0)
    }
    track {
        position = 9 to -1
        positions = listOf(-1 to 1, 0 to 1, 0 to 0, 1 to 0, 2 to 0)
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
                back()
                wait(1)
                grab()
                pivotClockwise()
                back()
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
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                rotateCounterClockwise()
                wait(1)
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
            sequence(4) {
                wait(12)
                back()
                grab()
                pivotCounterClockwise()
                forward()
                pivotClockwise()
                rotateClockwise()
                drop()
                wait(1)
                back()
                wait(1)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(18)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                reset()
                wait(5)
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(26)
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
