
solution {
    puzzle = "P100"
    name = "W3.5"
    arm(PISTON) {
        number = 1
        position = 2 to 1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to 3
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to 2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to 3
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -2 to -4
        rotation = -5
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to 2
        rotation = -3
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -3
        rotation = -4
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = -4
    }
    track {
        position = 3 to 0
        positions = listOf(-1 to 1, -2 to 2, -1 to 2, -2 to 3, -1 to 3)
    }
    track {
        position = -3 to -1
        positions = listOf(-2 to -2, -2 to -1, -1 to -1, -1 to 0, 0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(5)
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(22)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(16)
                grab()
                back()
                back()
                back()
                back()
                back()
                drop()
                forward()
                forward()
                wait(2)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                extend()
                forward()
                back()
                reset()
                wait(10)
                extendTape()
            }
        }
        )
    }
}
