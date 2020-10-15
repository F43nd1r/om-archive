
solution {
    puzzle = "P081"
    name = "B II 1-8T"
    arm(ARM6) {
        number = 1
        position = -2 to 5
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 4 to 5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 3 to 5
        rotation = 5
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 9 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 11 to 2
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 12 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 3 to 1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 4
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 9 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 10 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 6
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 4 to 2
        rotation = -2
    }
    track {
        position = 4 to 5
        positions = listOf(0 to 0, 1 to -1, 1 to -2)
    }
    track {
        position = 11 to 2
        positions = listOf(0 to 0, 1 to -1)
    }
    conduit {
        id = 100
        position = -2 to 4
        rotation = 0
    }
    conduit {
        id = 100
        position = 4 to 4
        rotation = 0
    }
    conduit {
        id = 101
        position = 1 to 5
        rotation = -1
    }
    conduit {
        id = 101
        position = 9 to 0
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(14)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                grab()
                extend()
                drop()
                forward()
                grab()
                retract()
                drop()
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                forward()
                drop()
                grab()
                pivotCounterClockwise()
                forward()
                drop()
                wait(2)
                grab()
                pivotCounterClockwise()
                back()
                drop()
                back()
            }
        }
        )
    }
}
