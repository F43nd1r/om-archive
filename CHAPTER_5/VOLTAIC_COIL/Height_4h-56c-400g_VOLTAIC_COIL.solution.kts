
solution {
    puzzle = "P039"
    name = "H4 6T"
    arm(PISTON) {
        number = 1
        position = 1 to 0
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 0 to -1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 1 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 0 to -3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 1 to -3
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = 2 to -3
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = 2 to 0
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = 3 to 0
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 4 to -2
        rotation = 4
    }
    glyph(BONDER) {
        position = 5 to -1
        rotation = 4
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = 6
    }
    glyph(BONDER) {
        position = 6 to -1
        rotation = 5
    }
    glyph(UNBONDER) {
        position = 7 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 8 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 3 to -2
        rotation = 0
    }
    track {
        position = 0 to -3
        positions = listOf(0 to 2, 1 to 1, 0 to 1, -1 to 1, 0 to 0, 1 to 0)
    }
    track {
        position = 4 to 0
        positions = listOf(-2 to 0, -1 to 0, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                wait(1)
                forward()
                forward()
                extend()
                rotateCounterClockwise()
                drop()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                extend()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                retract()
                wait(1)
                extend()
                drop()
                wait(2)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(1)
                grab()
                back()
                wait(1)
                forward()
                drop()
                back()
                wait(1)
                forward()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        )
    }
}
