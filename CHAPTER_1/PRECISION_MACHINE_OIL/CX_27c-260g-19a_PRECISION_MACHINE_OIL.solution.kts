
solution {
    puzzle = "P012"
    name = "B CA 6T"
    arm(ARM1) {
        number = 1
        position = 0 to -4
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -2
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -1 to -1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -2 to 0
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -2 to 1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 2 to -2
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 3 to -3
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 2 to -3
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = -5
    }
    glyph(PROJECTION) {
        position = 0 to -3
        rotation = -5
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -4
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -3
        rotation = 0
    }
    track {
        position = 2 to -3
        positions = listOf(1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = -2 to 1
        positions = listOf(0 to -1, 0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                back()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                forward()
                grab()
                back()
                extend()
                reset()
                wait(3)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                back()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        )
    }
}
