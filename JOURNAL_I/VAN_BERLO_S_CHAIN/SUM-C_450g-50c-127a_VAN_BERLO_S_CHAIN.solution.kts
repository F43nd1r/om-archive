
solution {
    puzzle = "P055"
    name = "B CA 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to 2
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -1 to 4
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -1 to 3
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 0 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 3 to -3
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 1 to -3
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = 2 to -3
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = 3 to -4
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 0
    }
    track {
        position = 1 to -3
        positions = listOf(0 to 0, 0 to -1, 1 to -1, 2 to -1, 1 to 0)
    }
    track {
        position = 4 to -4
        positions = listOf(-1 to 1, 0 to 1, 0 to 2, 1 to 2)
    }
    track {
        position = -1 to 5
        positions = listOf(0 to -1, 1 to -2, 0 to -2)
    }
    tape {
        parallel(
        {
            sequence(2) {
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
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                forward()
                grab()
                forward()
                forward()
                forward()
                extend()
                drop()
                retract()
                forward()
                wait(3)
                repeat()
                wait(11)
                repeat()
                wait(11)
                forward()
                grab()
                forward()
                forward()
                forward()
                extend()
                drop()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                forward()
                forward()
                forward()
                extend()
                drop()
                retract()
                forward()
                wait(3)
                forward()
                repeat()
                wait(11)
                repeat()
                wait(11)
                grab()
                forward()
                forward()
                forward()
                extend()
                drop()
                retract()
                forward()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(3)
                forward()
                wait(3)
                forward()
                grab()
                forward()
                forward()
                forward()
                extend()
                drop()
                retract()
                repeat()
                wait(11)
                repeat()
                wait(11)
                forward()
                wait(3)
                forward()
                grab()
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
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
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                forward()
                forward()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                extend()
                rotateCounterClockwise()
                forward()
                drop()
                retract()
                rotateClockwise()
                forward()
                wait(3)
                forward()
                repeat()
                wait(11)
                repeat()
                wait(11)
                grab()
                extend()
                rotateCounterClockwise()
                forward()
                drop()
                retract()
                rotateClockwise()
                forward()
                wait(6)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                forward()
                wait(3)
                forward()
                grab()
                extend()
                rotateCounterClockwise()
                forward()
                drop()
                retract()
                rotateClockwise()
                repeat()
                wait(11)
                repeat()
                wait(11)
                forward()
                wait(3)
                forward()
                grab()
                extend()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                forward()
                grab()
                extend()
                rotateCounterClockwise()
                forward()
                drop()
                retract()
                rotateClockwise()
                forward()
                wait(3)
                repeat()
                wait(11)
                repeat()
                wait(11)
                forward()
                grab()
                extend()
                rotateCounterClockwise()
                forward()
                drop()
                retract()
                rotateClockwise()
                wait(3)
                reset()
            }
        }
        )
    }
}
