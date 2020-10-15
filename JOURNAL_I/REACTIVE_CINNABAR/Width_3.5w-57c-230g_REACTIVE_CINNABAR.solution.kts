
solution {
    puzzle = "P056"
    name = "W3.5 2T"
    arm(PISTON) {
        number = 1
        position = -1 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -4
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -2 to 0
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 0 to 1
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    track {
        position = -3 to -4
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 0 to 1
        positions = listOf(-1 to 1, 0 to 0, -1 to 0)
    }
    track {
        position = -2 to 0
        positions = listOf(-1 to 0, 0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(5)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                back()
                drop()
                forward()
                wait(1)
                grab()
                back()
                drop()
                retract()
                rotateCounterClockwise()
                back()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                back()
                drop()
                forward()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                forward()
                drop()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                back()
                extend()
                grab()
                back()
                drop()
                forward()
                wait(1)
                grab()
                back()
                reset()
            }
        }
        )
    }
}
