
solution {
    puzzle = "P009"
    name = "B CA 2T"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 0
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 4 to -2
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 0 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = 4
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
