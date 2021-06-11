
solution {
    puzzle = "P064"
    name = "B CI59 1-2T"
    arm(ARM3) {
        number = 1
        position = 4 to 0
        rotation = -2
        size = 3
    }
    arm(ARM3) {
        number = 2
        position = -1 to 2
        rotation = -1
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = -1 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 4 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 4 to 2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 5 to -2
        rotation = -4
        size = 3
    }
    arm(ARM2) {
        number = 8
        position = 4 to -2
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = 6 to -3
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 3 to -3
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = 6 to -5
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -2
    }
    glyph(PROJECTION) {
        position = 3 to 0
        rotation = 3
    }
    glyph(PROJECTION) {
        position = 3 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = -4
    }
    io(INPUT) {
        index = 1
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to -1
        rotation = 0
    }
    track {
        position = 3 to -1
        positions = listOf(0 to 0, 1 to -1, 2 to -1)
    }
    track {
        position = 3 to 1
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 1)
    }
    track {
        position = 6 to -5
        positions = listOf(0 to 0, 0 to 1, -1 to 2, -1 to 1)
    }
    track {
        position = 5 to -1
        positions = listOf(0 to 0, -1 to 1, 0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                extend()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                back()
                drop()
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                back()
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(8)
                grab()
                back()
                drop()
                back()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                drop()
                back()
                back()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
