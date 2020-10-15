
solution {
    puzzle = "P064"
    name = "H3"
    arm(PISTON) {
        number = 1
        position = -7 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -6 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -8 to 1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -7 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -7 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 0 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -9 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -9 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -8 to -1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -6 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -6 to 0
        rotation = 0
    }
    track {
        position = -7 to -1
        positions = listOf(0 to 0, -1 to 1, -1 to 2)
    }
    track {
        position = -8 to -1
        positions = listOf(-1 to 1, 0 to 0, -1 to 0)
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                extend()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                reset()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(19)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                forward()
                grab()
                back()
                reset()
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        )
    }
}
