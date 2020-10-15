
solution {
    puzzle = "P026"
    name = "W3 2T"
    arm(PISTON) {
        number = 1
        position = -3 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to -4
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -2 to -3
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 0 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 3 to 1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 3 to 3
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to 3
        rotation = 4
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to 4
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(0 to -1, 0 to 0, 1 to -1)
    }
    track {
        position = -3 to -2
        positions = listOf(0 to 0, 0 to -1, 1 to -2, 1 to -1, 2 to -1)
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                back()
                grab()
                forward()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                forward()
                extend()
                grab()
                retract()
                rotateClockwise()
                drop()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                retract()
                back()
                pivotClockwise()
                extend()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(10)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(10)
                grab()
                rotateCounterClockwise()
                reset()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                extend()
                drop()
                retract()
                forward()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                reset()
            }
        }
        )
    }
}
