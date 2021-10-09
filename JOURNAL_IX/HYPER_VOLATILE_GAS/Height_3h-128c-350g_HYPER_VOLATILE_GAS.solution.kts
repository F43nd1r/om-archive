
solution {
    puzzle = "P106"
    name = "H3"
    arm(ARM1) {
        number = 1
        position = -14 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -13 to -2
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -8 to -2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -9 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -5 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -2 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 0 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 1 to -1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -8 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = -7 to -2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -2
        rotation = 6
    }
    glyph(UNBONDER) {
        position = -9 to -1
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -11 to -1
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -1
        rotation = -4
    }
    track {
        position = -6 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -14 to -1
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 2 to -1)
    }
    track {
        position = 0 to -1
        positions = listOf(-2 to 1, -1 to 1)
    }
    track {
        position = 0 to 0
        positions = listOf(2 to -1, 1 to -1, 0 to -1, 1 to -2, 2 to -2, 3 to -2)
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
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                wait(2)
                back()
                grab()
                pivotClockwise()
                forward()
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
                reset()
                wait(4)
                grab()
                pivotCounterClockwise()
                forward()
                drop()
                wait(3)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(18)
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                forward()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(19)
                forward()
                forward()
                forward()
                grab()
                pivotCounterClockwise()
                forward()
                back()
                back()
                drop()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
