
solution {
    puzzle = "P029"
    name = "HC"
    arm(ARM1) {
        number = 1
        position = -7 to -1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -5 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -5 to 1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -7 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -4 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -2 to 0
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -2 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -1 to 1
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = -1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 1 to -1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -4 to 0
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 12 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 12 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 14 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -5 to 0
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 1)
    }
    track {
        position = -7 to -1
        positions = listOf(0 to 0, 1 to 0, 0 to 1, 1 to 1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(3)
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
                wait(3)
                repeat()
                wait(3)
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
                wait(3)
                repeat()
                wait(3)
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
            sequence(4) {
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
                wait(3)
                repeat()
                wait(3)
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
            sequence(1) {
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
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(14)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                extend()
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
                wait(3)
                repeat()
                wait(3)
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
            sequence(8) {
                wait(7)
                forward()
                wait(3)
                forward()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                rotateClockwise()
                wait(2)
                repeat()
                wait(15)
                repeat()
                wait(13)
                forward()
                wait(2)
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                wait(2)
                forward()
                extend()
                extend()
                drop()
                forward()
                retract()
                retract()
                rotateClockwise()
                repeat()
                wait(15)
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                wait(2)
                forward()
                extend()
                extend()
                drop()
                forward()
                wait(1)
                forward()
                wait(2)
                forward()
            }
        }
        , 
        {
            sequence(9) {
                wait(7)
                forward()
                extend()
                extend()
                drop()
                forward()
                retract()
                retract()
                rotateClockwise()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                wait(2)
                repeat()
                wait(15)
                repeat()
                wait(13)
                forward()
                extend()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
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
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                rotateClockwise()
                wait(2)
                forward()
                wait(3)
                forward()
                wait(1)
                repeat()
                wait(15)
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                forward()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                extend()
                extend()
            }
        }
        )
    }
}
