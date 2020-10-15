
solution {
    puzzle = "P064"
    name = "W3.5"
    arm(PISTON) {
        number = 1
        position = -7 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -6 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -5 to -3
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -4 to -3
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -6 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -1 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -8 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -7 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -7 to -2
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -6 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -6 to -1
        rotation = 0
    }
    track {
        position = -7 to -2
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = -5 to -4
        positions = listOf(0 to 1, 0 to 0, -1 to 1)
    }
    track {
        position = -1 to 2
        positions = listOf(1 to -1, 0 to -1, 0 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                extend()
                wait(1)
                pivotCounterClockwise()
                wait(1)
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
                wait(5)
                repeat()
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
            sequence(5) {
                wait(4)
                grab()
                back()
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
            sequence(4) {
                wait(6)
                grab()
                retract()
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
            sequence(3) {
                wait(2)
                grab()
                forward()
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
                wait(19)
                grab()
                back()
                back()
                reset()
            }
        }
        )
    }
}
