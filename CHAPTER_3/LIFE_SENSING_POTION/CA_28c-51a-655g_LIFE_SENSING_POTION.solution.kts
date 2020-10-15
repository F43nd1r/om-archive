
solution {
    puzzle = "P030b"
    name = "B CA 6T"
    arm(PISTON) {
        number = 1
        position = -7 to 4
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -2 to -1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -4 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -2 to 3
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = -6 to -3
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = -5 to -3
        rotation = 1
        size = 2
    }
    arm(ARM3) {
        number = 8
        position = -5 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -7 to 0
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -7 to 1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 11
        position = -1 to -3
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 12
        position = -2 to -2
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 13
        position = -1 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = -6 to 4
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 15
        position = -2 to -3
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -2 to 0
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = -4 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -6 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -6 to 3
        rotation = 0
    }
    track {
        position = -6 to -2
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    track {
        position = -2 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = -3 to 3
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 1 to 0)
    }
    track {
        position = -8 to 1
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(14) {
                wait(4)
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
            sequence(15) {
                wait(4)
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
            sequence(11) {
                wait(2)
                grab()
                retract()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                back()
                extend()
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                forward()
                extend()
                drop()
                retract()
                forward()
                wait(1)
                forward()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
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
            sequence(4) {
                wait(2)
                grab()
                forward()
                forward()
                drop()
                forward()
                wait(2)
                forward()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
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
            sequence(9) {
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                rotateClockwise()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(4)
                back()
                extend()
                grab()
                retract()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(4)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                back()
                extend()
                grab()
                retract()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                wait(1)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                forward()
                grab()
                forward()
                extend()
                drop()
                retract()
                forward()
                wait(1)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                forward()
                grab()
                forward()
                forward()
                drop()
                forward()
                wait(2)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
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
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                retract()
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
        )
    }
}
