
solution {
    puzzle = "P057"
    name = "B CA"
    arm(ARM1) {
        number = 1
        position = 1 to 2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 0 to 2
        rotation = 4
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 0 to -4
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 0 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 2 to -3
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 4 to -4
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 3 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 0 to -2
        rotation = 0
    }
    track {
        position = 0 to -3
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to -1, 4 to -1, 4 to 0)
    }
    track {
        position = 1 to 3
        positions = listOf(0 to -2, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                wait(4)
                forward()
                drop()
                rotateCounterClockwise()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                extend()
                back()
                wait(1)
                forward()
                forward()
                back()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                retract()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(3)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                drop()
                wait(2)
                reset()
            }
        }
        )
    }
}
