
solution {
    puzzle = "P039"
    name = "H4 6T"
    arm(ARM1) {
        number = 1
        position = 4 to -2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 3 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 2 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 2 to -1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to -1
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = 1 to -3
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 0 to -1
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = -2 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 3 to -3
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -3
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -16 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -2
        rotation = 0
    }
    track {
        position = -3 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 3 to -1, 2 to 0, 1 to 1, 1 to 0)
    }
    track {
        position = 2 to -3
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                back()
                back()
                back()
                drop()
                wait(3)
                back()
                back()
                back()
                wait(2)
                back()
                grab()
                back()
                back()
                drop()
                wait(2)
                back()
                back()
                wait(3)
                back()
                back()
                back()
                wait(2)
                grab()
                back()
                back()
                back()
                drop()
                wait(2)
                back()
                back()
                back()
                wait(3)
                back()
                grab()
                back()
                back()
                drop()
                wait(1)
                back()
                back()
                grab()
                back()
                wait(1)
                forward()
                drop()
                back()
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                back()
                drop()
                wait(3)
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                back()
                grab()
                back()
                back()
                drop()
                wait(2)
                back()
                back()
                wait(3)
                back()
                back()
                back()
                wait(2)
                grab()
                back()
                back()
                back()
                drop()
                wait(2)
                back()
                back()
                back()
                wait(3)
                back()
                grab()
                back()
                back()
                drop()
                wait(1)
                back()
                back()
                grab()
                back()
                wait(1)
                forward()
                drop()
                back()
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                back()
                drop()
                wait(3)
                back()
                back()
                back()
                wait(2)
                back()
                grab()
                back()
                back()
                drop()
                wait(2)
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                extend()
                extend()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                extend()
                extend()
                back()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                back()
                wait(1)
                back()
                wait(2)
                grab()
                back()
                back()
                back()
                drop()
                wait(2)
                back()
                back()
                back()
                wait(3)
                back()
                grab()
                back()
                back()
                drop()
                wait(1)
                back()
                back()
                grab()
                back()
                wait(1)
                forward()
                drop()
                back()
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                back()
                drop()
                wait(3)
                back()
                back()
                back()
                wait(2)
                back()
                grab()
                back()
                back()
                drop()
                wait(2)
                back()
                back()
                wait(3)
                back()
                back()
                back()
                wait(2)
                grab()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(3)
                grab()
                back()
                reset()
                wait(9)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                back()
                wait(1)
                grab()
                back()
                wait(1)
                forward()
                drop()
                back()
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                back()
                drop()
                wait(3)
                back()
                back()
                back()
                wait(2)
                back()
                grab()
                back()
                back()
                drop()
                wait(2)
                back()
                back()
                wait(3)
                back()
                back()
                back()
                wait(2)
                grab()
                back()
                back()
                back()
                drop()
                wait(2)
                back()
                back()
                back()
                wait(3)
                back()
                grab()
                back()
                back()
                drop()
                wait(1)
                back()
                back()
                grab()
                back()
                wait(1)
                forward()
                drop()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateCounterClockwise()
                retract()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                back()
                wait(1)
                back()
                wait(3)
                back()
                grab()
                back()
                back()
                drop()
                wait(1)
                back()
                back()
                grab()
                back()
                wait(1)
                forward()
                drop()
                back()
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                back()
                drop()
                wait(3)
                back()
                back()
                back()
                wait(2)
                back()
                grab()
                back()
                back()
                drop()
                wait(2)
                back()
                back()
                wait(3)
                back()
                back()
                back()
                wait(2)
                grab()
                back()
                back()
                back()
                drop()
                wait(2)
                back()
                back()
                back()
                wait(3)
                back()
                grab()
                back()
                back()
                reset()
            }
        }
        )
    }
}
